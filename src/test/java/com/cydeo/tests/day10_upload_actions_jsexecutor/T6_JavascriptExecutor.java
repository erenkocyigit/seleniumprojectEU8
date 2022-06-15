package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {
    @Test
    public void javascript_executor_test1(){
        //Open a chrome browser
        //Go to https://practice.cydeo.com/infinite_scroll

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/infinite_scroll");

        driver.executeScript("window.scrollBy(0,750)");

    }

}

/*
    @Test
    public void javascript_executor_test1(){
        //Open a chrome browser
        //Go to https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");



        ////////////////////////////////////////  OPTION FOR DOWN CASTING ///////////////////////////////////////////////
//        ((JavascriptExecutor)Driver.getDriver()).executeScript("");

        //Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750)");

        //a. 750 pixels down 10 times
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }
        //b. 750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }


        //Javascript method to use:window.scrollBy(0,0)
    }
}


 */