package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){

        // 1. Open browser
        // 2. Go to website "https://practice.cydeo.com/registration_form"
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        // Create JavaFaker object
        Faker faker = new Faker();

        // 3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());
        // 4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());
        // 5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String userName = faker.bothify("erenbaba58###");
        inputUserName.sendKeys(userName);
        System.out.println("userName = " + userName);
        // 6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(userName+"@hotmail.com");
        // 7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("#########"));
        // 8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("571-###-####"));
        // 9. Select a gender from radio buttons
        WebElement radioButtonGender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        radioButtonGender.click();
        // 10. Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthday.sendKeys("12/12/2000");
        // 11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        //12.Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,9));
        //13.Select programming language from checkboxes
        WebElement checkBoxProgrammingLanguage = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        checkBoxProgrammingLanguage.click();
        //14.Click to sign up button
        WebElement signupButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));
        signupButton.click();
        //15.Verify success message “You’ve successfully completed registration.” isdisplayed.
        String expectedSuccessMessage = "You've successfully completed registration!";
        String actualSuccessMessage = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).getText();

        Assert.assertEquals(actualSuccessMessage,expectedSuccessMessage);
        System.out.println("expectedSuccessMessage = " + expectedSuccessMessage);
        System.out.println("actualSuccessMessage = " + actualSuccessMessage);


    }

}
