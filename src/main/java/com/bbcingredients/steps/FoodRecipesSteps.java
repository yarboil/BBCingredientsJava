package com.bbcingredients.steps;


import com.bbcingredients.TestLogger;
import com.bbcingredients.pageobjects.*;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class FoodRecipesSteps {

    WebDriver driver = new FirefoxDriver();
    FoodRecipe foodRecipe = new FoodRecipe(driver);
    FoodSearch foodSearch = new FoodSearch(driver);
    YourFavouritesPage favouritesPage = new YourFavouritesPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @Given("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.usernameField.sendKeys("testtestuser@hotmail.com");
        loginPage.passwordField.sendKeys("Abc123");
        loginPage.signinbutton.click();
        TestLogger.info("Logged in");
    }

    @Given("^I am on Food recipe page$")
    public void iAmOnFoodSearch() throws Throwable {
        foodRecipe.navigateToFoodRecipesPage();
        TestLogger.info("Navigated to food recipe page");
    }

    @When("^I click quick recipe finder first checkbox$")
    public void iClickQuickRecipeFinderFirstCheckbox() throws Throwable {
        foodRecipe.firstCheckbox.click();
        TestLogger.info("Clicked first checkbox");
    }

    @When("^I click search$")
    public void iClickSearch() throws Throwable {
        foodRecipe.searchIcon.click();
        TestLogger.info("Clicked search icon");
    }

    @When("^I am on food search page$")
    public void iAmOnFoodSearchPage() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(foodSearch.articleList));
        TestLogger.info("Article list displayed");
    }

    @When("^I click first filter in search results$")
    public void iClickFirstFilterInSearchResults() throws Throwable {
        foodSearch.recipeFinder.get(0).click();
        TestLogger.info("Clicked first filter within search results");
    }

    @When("^I click first checkbox recipe$")
    public void iClickFirstCheckboxRecipe() throws Throwable {
        foodSearch.clickCategoryFilter(1);
        TestLogger.info("Clicked first recipe checkbox");
    }

    @Then("^I should see recipe in results$")
    public void iShouldSeeRecipeInResults() throws Throwable {
        String filterName = foodSearch.dishesFilter.get(1).getText();
        wait.until(ExpectedConditions.visibilityOf(foodSearch.articleName));
        assertTrue(filterName.contains(foodSearch.articleName.getText()));
        TestLogger.info("Recipe within filter contains article name");
    }

    @When("^I click add to favourites$")
    public void iClickAddToFavourites() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(foodRecipe.addToFavouritesButton));
        foodRecipe.addToFavouritesButton.click();
        TestLogger.info("Clicked add to favourites button");
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String favouritesText) throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(foodRecipe.addToFavouritesButton));
        assertTrue(foodRecipe.addToFavouritesButton.getText().equals(favouritesText));
        TestLogger.info("Favourites button text equals favourites page text");
    }

    @When("^I click your favourites button$")
    public void iClickYourFavouritesButton() throws Throwable {
        foodRecipe.favouritesButton.click();
        TestLogger.info("Clicked favourites button");
    }

    @Then("^I should see recipe in favourites$")
    public void iShouldSeeRecipeInFavourites() throws Throwable {
        assertTrue(favouritesPage.recipeContainer.isDisplayed());
        TestLogger.info("Clicked recipe is displayed within favourites");
    }

    @When("^I click cross button$")
    public void iClickCrossButton() throws Throwable {
        favouritesPage.waitForVisibility(favouritesPage.crossButton);
        favouritesPage.crossButton.click();
        TestLogger.info("Clicked cross button");
    }

    @When("^I click remove button$")
    public void iClickRemoveButton() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(favouritesPage.favouritesRemoveButton));
        favouritesPage.favouritesRemoveButton.click();
        TestLogger.info("Clicked remove button");
    }

    @Then("^I should see add to favourites button$")
    public void iShouldSeeAddToFavouritesButton() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(favouritesPage.addToFavouritesButton));
        assertTrue(favouritesPage.addToFavouritesButton.isDisplayed());
        TestLogger.info("No recipe text displayed");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
