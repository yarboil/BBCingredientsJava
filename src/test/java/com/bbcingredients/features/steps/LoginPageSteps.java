package com.bbcingredients.features.steps;

import com.bbcingredients.features.support.helper.DriverFactory;
import com.bbcingredients.features.support.helper.pageobjects.LoginPage;
import cucumber.api.java.en.Given;
import org.junit.AfterClass;

public class LoginPageSteps extends DriverFactory {

    @Given("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        new LoginPage(getDriver()).get();
        new LoginPage(getDriver()).enterUsername();
        new LoginPage(getDriver()).enterPassword();
        new LoginPage(getDriver()).signIn();
    }

    @AfterClass
    public void tearDown(){
        destroyDriver();
    }
}
