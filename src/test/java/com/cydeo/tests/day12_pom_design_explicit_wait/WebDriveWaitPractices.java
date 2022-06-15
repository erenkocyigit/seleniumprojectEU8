package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriveWaitPractices {


    @Test
    public void dynamic_load_7_test(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”

        //creating the wait object to be able to create certain condition to wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //use the "wait" object to create our expected condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //Create object of DynamicLoad7Page to reach and assert web elements
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dynamicLoad7Page.spongeBobImage));

        //4. Assert: Image is displayed
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

    }

    @Test
    public void dynamic_load_1_test(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


        //click to start
        dynamicLoad1Page.startButton.click();

        //wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUserName.isDisplayed());

        //enter username : tomsmith
        dynamicLoad1Page.inputUserName.sendKeys("tomsmith");

        //enter password : incorrectpassword
        dynamicLoad1Page.inputPassword.sendKeys("somethingwrong");
        //click to submit button
        dynamicLoad1Page.submitButton.click();
        //Asser "Your password is invalid!" text is displayed
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());


    }
}
