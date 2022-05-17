package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //go to https:/login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https:/login1.nextbasecrm.com/?forgot_password=yes");

        //Verify "reset password" button text is as expected:
        //Expected : Reset Password


        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetPasswordButton = "Reset password";
        String actualResetPasswordButton = resetPasswordButton.getText();

        if (expectedResetPasswordButton.equals(actualResetPasswordButton)) {
            System.out.println("Reset password button name PASSED");
        } else {
            System.out.println("Reset password button name FAILED");
        }


    }


}
