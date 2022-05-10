package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //go to: https://login1.nextbasecrm.com
        driver.get("https://login1.nextbasecrm.com");

        //Verify "Log In" button text is as expected
        //Expected : Log In
        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        String actualButtonText = signInButton.getAttribute("value");

       // System.out.println(actualButtonText);

        if (expectedButtonText.equals(actualButtonText)){
            System.out.println("Button text verification is PASSED");
        }else {
            System.out.println("Button text verification is FAILED");
        }




    }


}
