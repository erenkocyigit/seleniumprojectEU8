package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test(){

        //Go to "https://practice.cydeo.com/hovers"
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());
        //Hover over to first image
        //Assert
        //a. "name: user1" is displayed
        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed());

        //Hover over to second image
        //assert user2 displayed
        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());

        //Hover over to third image
        //assert user3 displayed
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());




    }



}
