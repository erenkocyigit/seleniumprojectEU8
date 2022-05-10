package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class T1_locators_getText {

    public static void main(String[] args) {

        // Open a Chrome Browser, maximize it
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // go to https://login1.nextbasecrm.com
        driver.get("https://login1.nextbasecrm.com");
        // enter incorrect username : "incorrect"
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        //enter incorrect password: "incorrect"
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //click to login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //verify error message text is as expected
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (expectedErrorMessage.equals(actualErrorMessage)) {
            System.out.println("Incorrect error message is PASSED");
        } else {
            System.out.println("Incorrect error message is FAILED");
        }


    }

}
