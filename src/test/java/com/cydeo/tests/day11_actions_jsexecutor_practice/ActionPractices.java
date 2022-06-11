package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void task_4_and_5_test(){
        //open a chrome browser
        //go to : https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //scroll down to "Powered by CYDEO"

        // create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //scroll using Actions class "moveTo(element)" method
        actions.moveToElement(cydeoLink).perform();

        //scroll back up to "Home" link using PageUP button
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Driver.closeDriver();

    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

}
