package com.selenium.demo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Project Name    : selenium-testng-page-factory-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 7/15/2019
 * Time            : 11:56 AM
 * Description     :
 **/


public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Using FindBy for locating elements
     */
    @FindBy(how = How.XPATH, using = "//a[@class='account']/span")
    private WebElement profileNameLabel;
    @FindBy(how = How.XPATH, using = "//a[@class='logout']")
    private WebElement logoutLink;

    /**
     * Defining all the user actions (Methods) that can be performed in the home page
     */
    // This method to get the username of the logged-in user
    public String getLoggedInUsername(){
        return profileNameLabel.getText();
    }

    // This method to click on Logout link
    public void clickOnLogoutLink(){
        logoutLink.click();
    }


}
