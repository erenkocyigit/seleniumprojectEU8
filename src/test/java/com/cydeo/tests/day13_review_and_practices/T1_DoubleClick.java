package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void t1_double_click_test(){
        //1. Goto
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double-click on the text “Double-click me to change my text color.”
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        BrowserUtils.sleep(4);
        //Locate "Accept Cookies" button and click
//        wait.until(ExpectedConditions.visibilityOf(doubleClickPage.acceptCookies));
//        doubleClickPage.acceptCookies.click();

        actions.doubleClick(doubleClickPage.textDoubleClick).perform();

        //4. Assert:Text’s “style” attribute value contains “red”.
        System.out.println("doubleClickPage.textToDoubleClick.getAttribute(\"style\") = " + doubleClickPage.textDoubleClick.getAttribute("style"));

        String actualStyleAttributeValue = doubleClickPage.textDoubleClick.getAttribute("style");
        String expectedInStyleAttribute = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedInStyleAttribute));

    }


}
