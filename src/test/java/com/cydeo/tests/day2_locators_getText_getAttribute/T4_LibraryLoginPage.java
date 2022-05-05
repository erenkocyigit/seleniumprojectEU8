package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {


    public static void main(String[] args) {
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to "https://library2.cybertekschool.com/login.html"
        driver.get("https://library2.cybertekschool.com/login.html");

        //Enter username
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        //Enter password
        WebElement userPasswordInput = driver.findElement(By.id("inputPassword"));
        userPasswordInput.sendKeys("incorrect password");

        //Click to sign in button

        WebElement signInButton  = driver.findElement(By.tagName("button"));
        signInButton.click();



    }



}
