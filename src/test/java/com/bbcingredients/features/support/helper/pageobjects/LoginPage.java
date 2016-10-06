package com.bbcingredients.features.support.helper.pageobjects;

import com.bbcingredients.features.support.helper.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginPage extends LoadableComponent <LoginPage> {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    protected void load(){
        driver.get("https://www.bbc.com/signin");
    }

    @Override
    protected void isLoaded() throws Error {
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("bbc"));
    }

    @FindBy(id ="username-input")
    private WebElement usernameField;

    @FindBy(id = "password-input")
    private WebElement passwordField;

    @FindBy(id = "submit-button")
    private WebElement signinbutton;

    public void enterUsername(){
        String username = new PropertyReader().readProperty("username");
        usernameField.sendKeys(username);
    }

    public void enterPassword(){
        String password = new PropertyReader().readProperty("password");
        passwordField.sendKeys(password);
    }

    public void signIn(){
        signinbutton.click();
    }
}
