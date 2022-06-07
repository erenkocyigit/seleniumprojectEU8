package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN extends TestBase {



    //TC#3 Login Scenario
    @Test
    public void crm_login_test() {

        //go to "https://login1.nextbasecrm.com/"
        driver.get("https://login1.nextbasecrm.com/");

        //enter a valid name
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //enter a valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //Click to log in button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //Verify title is as expected:
        //Expected:Portal
        BrowserUtils.verifyTitle(driver, "Portal");


    }

    @Test
    public void crm_login_test_2() {

        //go to "https://login1.nextbasecrm.com/"
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        //Verify title is as expected:
        //Expected:Portal
        BrowserUtils.verifyTitle(driver, "Portal");


    }
    @Test
    public void crm_login_test_3() {

        //go to "https://login1.nextbasecrm.com/"
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");

        //Verify title is as expected:
        //Expected:Portal
        BrowserUtils.verifyTitle(driver, "Portal");


    }


}
