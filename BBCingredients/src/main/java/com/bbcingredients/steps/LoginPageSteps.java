package com.bbcingredients.steps;

import com.bbcingredients.pageobjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageSteps {

    WebDriver driver = new FirefoxDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("^I am on signin page$")
    public void iAmOnSigninPage() throws Throwable {
        loginPage.navigateToLoginPage();
        loginPage.waitForVisibility(loginPage.aboutbbcid);
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String username, String password) throws Throwable {
        loginPage.usernameField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);
    }

    @When("^I click signin$")
    public void iClickSignin() throws Throwable {
        loginPage.signinbutton.click();
    }

}
