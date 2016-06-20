package com.bbcingredients.steps;

import com.bbcingredients.helper.DriverFactory;
import com.bbcingredients.pageobjects.FoodSearchPage;
import com.bbcingredients.pageobjects.YourFavouritesPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


public class FoodSearchSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp(){
        driver = new DriverFactory().getDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @After
    public void tearDown(){
        new DriverFactory().destoryDriver();
    }

    @When("^I am on food search page$")
    public void iAmOnFoodSearchPagePage() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(new FoodSearchPage(driver).articleList));
    }

    @When("^I click first filter in search results$")
    public void iClickFirstFilterInSearchResults() throws Throwable {
        new FoodSearchPage(driver).recipeFinder.get(0).click();
    }

    @When("^I click first checkbox recipe$")
    public void iClickFirstCheckboxRecipe() throws Throwable {
        new FoodSearchPage(driver).clickCategoryFilter(1);
    }

    @Then("^I should see recipe in results$")
    public void iShouldSeeRecipeInResults() throws Throwable {
        String filterName = new FoodSearchPage(driver).dishesFilter.get(1).getText();
        wait.until(ExpectedConditions.visibilityOf(new FoodSearchPage(driver).articleName));
        assertTrue(filterName.contains(new FoodSearchPage(driver).articleName.getText()));
    }

    @Then("^I should see add to favourites button$")
    public void iShouldSeeAddToFavouritesButton() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(new YourFavouritesPage(driver).addToFavouritesButton));
        assertTrue(new YourFavouritesPage(driver).addToFavouritesButton.isDisplayed());
    }
}
