package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //locate the checkboxes
        WebElement checkbox1= driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));

        // confirm checkbox#1 is not selected by default
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        // confirm checkbox#2 is selected by default
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //Click checkbox#1 to select it
        Thread.sleep(2000);
        checkbox1.click();

        //click checkbox#2 to deselect it
        Thread.sleep(2000);
        checkbox2.click();

        //confirm checkbox#1 is selected
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        //confrim checkbox#2 is not selected
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());


    }

}
