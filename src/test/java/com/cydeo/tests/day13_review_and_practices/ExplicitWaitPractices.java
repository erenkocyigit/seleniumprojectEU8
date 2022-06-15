package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.sun.source.tree.AssertTree;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;
    WebDriverWait wait;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
        wait = new WebDriverWait(Driver.getDriver(),10);
    }

    @Test
    public void remove_button_test(){
        //click to "Remove" button
        dynamicControlsPage.removeButton.click();

        //wait until "loading bar disappears
//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //Verify : a.Check box is not displayed

        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
            Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed());
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        }catch (NoSuchElementException e){
            Assert.assertTrue(true);
        }
        //         b."It's gone!" message is displayed
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
