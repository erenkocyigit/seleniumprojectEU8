package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WdmAgent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    /*
    IN THIS CLASS WE ARE SOLVING THE DAY2_TASK1
     */

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3. Verify URL contains
        //Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL PASS");
        }else{
            System.out.println("URL FAILED ");
        }
        // 4. Verify title:

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("TITLE PASSED");
        }else{
            System.out.println("TITLE FAILED");
        }

        driver.close();
        //Expected: Practice




    }

}