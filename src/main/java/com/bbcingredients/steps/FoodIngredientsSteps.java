package com.bbcingredients.steps;

import com.bbcingredients.helper.BasePage;
import com.bbcingredients.helper.DriverFactory;
import com.bbcingredients.pageobjects.*;
import com.bbcingredients.util.PropertyReader;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FoodIngredientsSteps{

    private WebDriver driver;

    @Before("@browser")
    public void setUp(){
        driver = new DriverFactory().getDriver();
    }

    @Before("@mobile")
    public void mobileSetup(){
        driver = new DriverFactory().getMobileDriver();
    }

    @After
    public void tearDown(){
        new DriverFactory().destroyDriver();
    }

    @Given("^I am on a mobile device$")
    public void iAmOnAMobileDevice() throws Throwable {
        driver = new DriverFactory().getMobileDriver();
    }

    @Given("^I am on food \"([^\"]*)\" page$")
    public void iAmOnFoodPage(String arg1) throws Throwable {
        driver.get(BasePage.baseUrl() + new PropertyReader().readProperty("ingredientspage"));
    }

    @Then("^I should see food image$")
    public void iShouldSeeFoodImage() throws Throwable {
        assertTrue(new FoodIngredientsPage(driver).foodImage.isDisplayed());
    }

    @Then("^I should see food caption$")
    public void iShouldSeeFoodCaption() throws Throwable {
        assertTrue(new FoodIngredientsPage(driver).foodCaption.isDisplayed());
    }

    @Then("^I should see food author$")
    public void iShouldSeeFoodAuthor() throws Throwable {
        assertTrue(new FoodIngredientsPage(driver).foodAuthor.isDisplayed());
    }

    @Then("^I should see first accordion open$")
    public void iShouldSeeFirstAccordionOpen() throws Throwable {
        assertThat(new FoodIngredientsPage(driver).accordionHeader.getAttribute("class"), containsString("open"));
    }

    @When("^I click second accordion$")
    public void iClickSecondAccordion() throws Throwable {
        new FoodIngredientsPage(driver).secondAccordionHeader.click();
    }

    @Then("^I should see accordion content$")
    public void iShouldSeeAccordionContent() throws Throwable {
        assertTrue(new FoodIngredientsPage(driver).accordionImage.isDisplayed());
    }

    @Then("^I should see mobile food image$")
    public void iShouldSeeMobileFoodImage() throws Throwable {
        assertTrue(new FoodIngredientsPage(driver).mobileFoodImage.isDisplayed());
    }

    @Then("^I should see mobile food author$")
    public void iShouldSeeMobileFoodAuthor() throws Throwable {
        assertTrue(new FoodIngredientsPage(driver).mobileFoodAuthor.isDisplayed());
    }

    @Then("^I should see mobile food caption$")
    public void iShouldSeeMobileFoodCaption() throws Throwable {
        assertTrue(new FoodIngredientsPage(driver).mobileFoodCaption.isDisplayed());
    }
}
