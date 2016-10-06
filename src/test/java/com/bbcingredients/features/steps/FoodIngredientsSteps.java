package com.bbcingredients.features.steps;

import com.bbcingredients.features.support.helper.DriverFactory;
import com.bbcingredients.features.support.helper.pageobjects.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FoodIngredientsSteps extends DriverFactory {

    @Given("^I am on food \"([^\"]*)\" page$")
    public void iAmOnFoodPage(String arg1) throws Throwable {
        new FoodIngredientsPage(getDriver()).get();
    }

    @Then("^I should see food image$")
    public void iShouldSeeFoodImage() throws Throwable {
        assertTrue(new FoodIngredientsPage(getDriver()).foodImage.isDisplayed());
    }

    @Then("^I should see food caption$")
    public void iShouldSeeFoodCaption() throws Throwable {
        assertTrue(new FoodIngredientsPage(getDriver()).foodCaption.isDisplayed());
    }

    @Then("^I should see food author$")
    public void iShouldSeeFoodAuthor() throws Throwable {
        assertTrue(new FoodIngredientsPage(getDriver()).foodAuthor.isDisplayed());
    }

    @Then("^I should see first accordion open$")
    public void iShouldSeeFirstAccordionOpen() throws Throwable {
        assertThat(new FoodIngredientsPage(getDriver()).accordionHeader.getAttribute("class"), containsString("open"));
    }

    @When("^I click second accordion$")
    public void iClickSecondAccordion() throws Throwable {
        new FoodIngredientsPage(getDriver()).secondAccordionHeader.click();
    }

    @Then("^I should see accordion content$")
    public void iShouldSeeAccordionContent() throws Throwable {
        assertTrue(new FoodIngredientsPage(getDriver()).accordionImage.isDisplayed());
    }

    @Then("^I should see mobile food image$")
    public void iShouldSeeMobileFoodImage() throws Throwable {
        assertTrue(new FoodIngredientsPage(getDriver()).mobileFoodImage.isDisplayed());
    }

    @Then("^I should see mobile food author$")
    public void iShouldSeeMobileFoodAuthor() throws Throwable {
        assertTrue(new FoodIngredientsPage(getDriver()).mobileFoodAuthor.isDisplayed());
    }

    @Then("^I should see mobile food caption$")
    public void iShouldSeeMobileFoodCaption() throws Throwable {
        assertTrue(new FoodIngredientsPage(getDriver()).mobileFoodCaption.isDisplayed());
    }

    @AfterClass
    public void tearDown(){
        destroyDriver();
    }
}
