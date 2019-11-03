package com.selenium.demo.test.base;

import com.selenium.demo.util.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Project Name    : selenium-testng-page-factory-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 11/3/2019
 * Time            : 6:14 PM
 * Description     :
 **/


public class TestBase {

    protected static WebDriver driver;

    // Initialize a driver instance of required browser
    @BeforeTest
    public static void initializeDriver(){
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    // Close all the driver instances
    @AfterTest
    public static void closeAllDrivers(){
        if(driver != null) {
            driver.quit();
        }
    }


}
