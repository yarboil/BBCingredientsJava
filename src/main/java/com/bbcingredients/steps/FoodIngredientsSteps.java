package com.bbcingredients.steps;

import com.bbcingredients.pageobjects.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FoodIngredientsSteps {

    WebDriver driver = new FirefoxDriver();
    FoodIngredients foodIngredients = new FoodIngredients(driver);

    @Given("^I am on food \"([^\"]*)\" page$")
    public void iAmOnFoodPage(String arg1) throws Throwable {
        foodIngredients.navigateToFoodIngredientsPage();
    }

    @Then("^I should see food image$")
    public void iShouldSeeFoodImage() throws Throwable {
        assertTrue(foodIngredients.foodImage.isDisplayed());
    }

    @Then("^I should see food caption$")
    public void iShouldSeeFoodCaption() throws Throwable {
        assertTrue(foodIngredients.foodCaption.isDisplayed());
    }

    @Then("^I should see food author$")
    public void iShouldSeeFoodAuthor() throws Throwable {
        assertTrue(foodIngredients.foodAuthor.isDisplayed());
    }

    @Then("^I should see first accordion open$")
    public void iShouldSeeFirstAccordionOpen() throws Throwable {
        assertThat(foodIngredients.accordionHeader.getAttribute("class"), containsString("open"));
    }

    @When("^I click second accordion$")
    public void iClickSecondAccordion() throws Throwable {
        foodIngredients.secondAccordionHeader.click();
    }

    @Then("^I should see accordion content$")
    public void iShouldSeeAccordionContent() throws Throwable {
        foodIngredients.waitForContent();
        assertTrue(foodIngredients.accordionImage.isDisplayed());
    }
}