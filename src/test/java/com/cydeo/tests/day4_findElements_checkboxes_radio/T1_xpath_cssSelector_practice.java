package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        //locate all the webelements on the page using xpath ad/or css
        //locator only(total of 6 )
        //locate homelink using cssSelector
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));

        //locate homelink using cssSelector syntax#2
        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));

        //locate homelink using cssSelector, href value
        WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));

        //b. "Forgot password" header
        //Locate header using cssSelector: locate parent element and move down to h2

        WebElement header_ex1= driver.findElement(By.cssSelector("div.example >h2"));

        //Locate header using xpath:
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. "e-mail" text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. e-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //locate inputbox using xpath contains method
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. "Retrieve password" button cssSelector
        WebElement retrievePassword = driver.findElement(By.cssSelector("button>i"));

        //e. "Retrieve password" button xpath
        WebElement retrievePassword_xPath = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. "powered by cydeo text
        WebElement cydeoText = driver.findElement(By.cssSelector("a[target='_blank']"));

        //f. powered by cydeo text xpath
        WebElement cydeoText_xPath = driver.findElement(By.xpath("//a[@href ='https://cydeo.com/' ]"));


        //4. Verify all web elements are displayed.

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("cydeoText.isDisplayed() = " + cydeoText.isDisplayed());


    }


}
