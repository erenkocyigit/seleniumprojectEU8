package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //go to https://practice.cydeo.com/web-tables
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }


    @Test
    public void order_name_verify_test(){


        //TC#1 : Web table practice
        //locate the cell that has Bob Martin text in it.
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        //verify bob's name is listed as expected
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();

        // expected : "Bob Martin"
        //verify bob martin
        Assert.assertEquals(actualBobName,expectedBobName);

        // verify bob martin's order date is as expected
        WebElement bobMartinOrderDateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedBobOrderDate = "12/31/2021";
        String actualBobOrderDate = bobMartinOrderDateCell.getText();

        // expected " 12/31/2021
        Assert.assertEquals(expectedBobOrderDate,actualBobOrderDate);



    }

    //We use the utility method we created
    @Test
    public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);
        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);
    }

    // using WebTableUtils.orderVerify(); method
    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");

    }

}
