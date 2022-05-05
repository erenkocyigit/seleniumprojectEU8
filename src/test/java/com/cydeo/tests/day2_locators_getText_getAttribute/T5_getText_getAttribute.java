package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        //Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to : https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //Verify header text is as expected
        WebElement headerText = driver.findElement(By.tagName("h2") );

        //Expected : Registration form
        String expectedHeaderText = "Registration form";

        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Correct header text");
        }else {
            System.out.println("wrong header text");
        }
        //Locate "First name" input box
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //Verify place holder attribute's value is a expected:
        //Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");




    }


}
