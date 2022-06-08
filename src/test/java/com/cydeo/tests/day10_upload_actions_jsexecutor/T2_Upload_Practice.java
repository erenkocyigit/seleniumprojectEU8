package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        // 1. go to "https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        // 2. find some small file from your computer, and get the path of it
        String path = "C:\\Users\\Eren KOÇYİĞİT\\Desktop\\tesla1.jpg";
        // 3. upload the file
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));

        // 4. assert:
        //=File uploaded text is displayed on the page
        Assert.assertTrue(fileUploadedHeader.isDisplayed());
    }


}
