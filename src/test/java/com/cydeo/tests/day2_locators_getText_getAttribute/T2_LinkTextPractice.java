package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) {

        //1.Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3. Click to A/B testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //4.Verify title is
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title pass");
        }else{
            System.out.println("Title fail");
        }

        //5. Go back to home page by using the .back();
        driver.navigate().back();

        String expectedTitle2= "Practice";
        actualTitle = driver.getTitle();
        if (expectedTitle2.equals(actualTitle)){
            System.out.println("Homepage title verification passed");
        }else{
            System.out.println("Homepage title verification failed");
        }







    }


}
