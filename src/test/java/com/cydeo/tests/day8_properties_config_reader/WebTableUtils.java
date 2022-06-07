package com.cydeo.tests.day8_properties_config_reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    //Method #1 info:
    // name : returnOrderDate()
    // return type : String
    // Arg1: WebDriver driver
    // Arg2: String costumerName
    // this method should accept a costumerName and return the customer order date as a String.

    public static String returnOrderDate(WebDriver driver, String customerName){

        String locator =  "//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();

    }

    //Method #2 info :
    // name : orderVerify()
    // return type : void
    // Arg1 : WebDriver driver
    // Arg1 : String costumerName
    // Arg1 : String expectedOrderDate
    // This method should accept above-mentioned arguments and internally assert expectedOrderDate matching actualOrderDate

    public static void orderVerify(WebDriver driver, String customerName,String expectedOrderDate){

        String locator =  "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();

        Assert.assertEquals(actualOrderDate,expectedOrderDate);



    }

}
