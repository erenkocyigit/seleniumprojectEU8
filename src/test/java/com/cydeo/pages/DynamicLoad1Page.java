package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {


    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//*[@id='loading']")
    public WebElement loadingBar;

    @FindBy(css = "#username")
    public WebElement inputUserName;

    @FindBy(css = "#pwd")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='flash-messages']")
    public WebElement errorMessage;


}
