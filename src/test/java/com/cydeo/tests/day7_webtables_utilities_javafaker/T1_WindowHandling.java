package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void window_handling_test(){

        driver.get("https://amazon.com");



        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://facebook.com','_blank');");

        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);

            System.out.println("Current URL:" + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }

            //5.Assert title contains "Etsy"
            String actualTitle = driver.getTitle();
            String expectedTitle = "Etsy";

            Assert.assertTrue(actualTitle.contains(expectedTitle));

        }



    }
}
