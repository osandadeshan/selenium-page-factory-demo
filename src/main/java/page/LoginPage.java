package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "email")
    private WebElement emailTextBox;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordTextBox;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email) {
        sendKeys(emailTextBox, email);
    }

    public void setPassword(String password) {
        sendKeys(passwordTextBox, password);
    }

    public void clickSignIn() {
        click(signInButton);
    }

    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickSignIn();
    }
}
