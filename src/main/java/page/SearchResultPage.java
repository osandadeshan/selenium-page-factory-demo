package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class='left-block']//div[@class='product-image-container']")
    private List<WebElement> searchResultsList;

    @FindBy(how = How.XPATH, using = "//div[@class='right-block']//h5//a")
    private WebElement firstSearchResultName;

    @FindBy(how = How.XPATH, using = "//div[@class='right-block']//span[@itemprop='price']")
    private WebElement firstSearchResultPrice;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public int getSearchResultCount() {
        return getElements(searchResultsList).size();
    }

    public String getFirstSearchResultName() {
        return getElement(firstSearchResultName).getText();
    }

    public String getFirstSearchResultPrice() {
        return getElement(firstSearchResultPrice).getText();
    }
}
