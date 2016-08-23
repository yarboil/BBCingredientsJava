package com.bbcingredients.steps;

import com.bbcingredients.helper.BasePage;
import com.bbcingredients.helper.DriverFactory;
import com.bbcingredients.pageobjects.LoginPage;
import com.bbcingredients.util.PropertyReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSteps {

    private WebDriver driver = new DriverFactory().getDriver();
    private String username = new PropertyReader().readProperty("username");
    private String password = new PropertyReader().readProperty("password");

    @Given("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        LoginPage loginPage = new LoginPage(driver);
        driver.get(new PropertyReader().readProperty("loginpage"));
        loginPage.usernameField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);
        loginPage.signinbutton.click();
    }
}
