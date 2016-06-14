package com.bbcingredients.pageobjects;

import com.bbcingredients.helper.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    protected WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css ="#bbcid_unique")
    public WebElement usernameField;

    @FindBy(css = "#bbcid_password")
    public WebElement passwordField;

    @FindBy(css = "#bbcid_submit_button")
    public WebElement signinbutton;

    @FindBy(css = "bbcid-content.valid-icon")
    public WebElement continueButton;

    @FindBy(css = ".bbcid-section-info" )
    public WebElement aboutbbcid;
}
