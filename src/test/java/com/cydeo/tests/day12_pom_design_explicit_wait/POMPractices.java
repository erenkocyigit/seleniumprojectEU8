package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {
    LibraryLoginPage libraryLoginPage =new LibraryLoginPage();

    @BeforeMethod
    public void setupMethod(){
        //open chrome and go to https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();

    }

    @Test
    public void required_field_error_message_test(){

        //Do not enter any information, click "Sign in" button

        libraryLoginPage.signInButton.click();

        // verify expected error is displayed
        // expected : This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        Driver.closeDriver();


    }
    @Test
    public void invalid_email_format_error_message_test(){


        //Enter invalid email format

        libraryLoginPage.inputUsername.sendKeys("somethingporsche");
        libraryLoginPage.signInButton.click();

        //verify expected error is displayed
        // expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void library_negative_login_test(){


        //Enter incorrect username or incorrect password
        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("aasdasd");
        libraryLoginPage.signInButton.click();
        //verify title expected error is displayed

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();

    }
}
