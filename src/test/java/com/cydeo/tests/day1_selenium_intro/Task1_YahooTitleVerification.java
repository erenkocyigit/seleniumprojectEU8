package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //do setup for browser driver
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //Make our page fullscreen
        driver.manage().window().maximize();
        //2. Go to https://www.yahoo.com
        driver.get("https://www.de.yahoo.com");
        //3. Verify title:
        //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle= "Yahooist Teil der Yahoo Markenfamilie";

        String actualTitle = driver.getTitle();

        System.out.println(expectedTitle);
        System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSED");
        }else {
            System.out.println("Verification FAILED");
        }

        //actual title comes from the browser




    }

}
