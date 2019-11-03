package com.selenium.demo.test.login;

import com.selenium.demo.page.CommonPage;
import com.selenium.demo.page.HomePage;
import com.selenium.demo.page.LoginPage;
import com.selenium.demo.test.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Project Name    : selenium-testng-page-factory-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 7/15/2019
 * Time            : 12:02 PM
 * Description     :
 **/


public class LoginTest extends TestBase {

    private LoginPage loginpage;
    private HomePage homepage;
    private CommonPage commonPage;

    @BeforeClass
    public void loginTest(){
        loginpage = PageFactory.initElements(driver, LoginPage.class);
        homepage = PageFactory.initElements(driver, HomePage.class);
        commonPage = PageFactory.initElements(driver, CommonPage.class);
    }

    @Test
    public void verifyValidUserLogin(){
        // Verify the login page tab title
        Assert.assertEquals(commonPage.getBrowserTabTitle(), "Login - My Store");

        // Input email address
        loginpage.setEmail("osanda@mailinator.com");

        // Input password
        loginpage.setPassword("1qaz2wsx@");

        // Click on SignIn button
        loginpage.clickOnSignInButton();

        // Verify the my store page tab title
        Assert.assertEquals(commonPage.getBrowserTabTitle(), "My account - My Store");

        // Verify the username of the logged-in user
        Assert.assertEquals(homepage.getLoggedInUsername(), "Osanda Nimalarathna");

        // Click on Logout link
        homepage.clickOnLogoutLink();

        // Verify the login page tab title
        Assert.assertEquals(commonPage.getBrowserTabTitle(), "Login - My Store");
    }


}
