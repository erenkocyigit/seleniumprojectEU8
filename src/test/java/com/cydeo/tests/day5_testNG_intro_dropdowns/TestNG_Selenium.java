package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

        WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //Do browser driver setup
        //Open browser
        driver = WebDriverFactory.getDriver("chrome");
        //Maximize the page
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Get "https://google.com
        driver.get("https://google.com");
        driver.findElement(By.id("L2AGLb")).click();
        //Assert: title is "Google"

    }

    @Test
    public void selenium_test(){

        Assert.assertEquals(driver.getTitle(),"Google","Title is not matching here.");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
