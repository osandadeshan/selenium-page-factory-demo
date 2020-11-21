package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

import static org.testng.Assert.assertEquals;
import static util.driver.DriverHolder.getDriver;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void loginBeforeMethod() {
        loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    }

    @Test(description = "Verify that a valid user can login to the application")
    public void testValidLogin() {
        loginPage.login("osanda@mailinator.com","1qaz2wsx@");
        HomePage homePage = PageFactory.initElements(getDriver(),HomePage.class);
        assertEquals(homePage.getLoggedInUsername(), "Osanda Nimalarathna");
    }

    @Test(description = "Verify that an invalid user cannot login to the application")
    public void testInvalidLogin() {
        loginPage.login("osanda@mailinator.com","abc12");
        assertEquals(getDriver().getTitle(), "Login - My Store");
    }
}
