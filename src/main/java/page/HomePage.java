package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class='header_user_info']//span")
    private WebElement usernameLabel;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement searchTextBox;

    @FindBy(how = How.CSS, using = "button[name='submit_search']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getLoggedInUsername() {
        return usernameLabel.getText();
    }

    private void enterSearchItem(String itemName) {
        sendKeys(searchTextBox, itemName);
    }

    private void enterSearchButton() {
        click(searchButton);
    }

    public void searchItem(String itemName) {
        enterSearchItem(itemName);
        enterSearchButton();
    }
}
