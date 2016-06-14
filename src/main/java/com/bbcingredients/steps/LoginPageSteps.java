package com.bbcingredients.steps;

import com.bbcingredients.helper.BasePage;
import com.bbcingredients.helper.DriverFactory;
import com.bbcingredients.pageobjects.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageSteps {

    WebDriver driver;

    @Before
    public void setUp(){
       driver = new DriverFactory().getDriver();
    }

    @Given("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://ssl.bbc.co.uk/id/signin");
        loginPage.usernameField.sendKeys("testtestuser@hotmail.com");
        loginPage.passwordField.sendKeys("Abc123");
        loginPage.signinbutton.click();
    }

}
