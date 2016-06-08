package com.bbcingredients.steps;


import com.bbcingredients.pageobjects.FoodRecipe;
import com.bbcingredients.pageobjects.FoodSearch;
import com.bbcingredients.pageobjects.LoginPage;
import com.bbcingredients.pageobjects.YourFavouritesPage;
import cucumber.api.PendingException;
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
    }

    @Given("^I am on Food recipe page$")
    public void iAmOnFoodSearch() throws Throwable {
        foodRecipe.navigateToFoodPage();
    }

    @When("^I click quick recipe finder first checkbox$")
    public void iClickQuickRecipeFinderFirstCheckbox() throws Throwable {
        foodRecipe.firstCheckbox.click();
    }

    @When("^I click search$")
    public void iClickSearch() throws Throwable {
        foodRecipe.searchIcon.click();
    }

    @When("^I am on food search page$")
    public void iAmOnFoodSearchPage() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(foodSearch.articleList));
    }

    @When("^I click first filter in search results$")
    public void iClickFirstFilterInSearchResults() throws Throwable {
        foodSearch.recipeFinder.get(0).click();
    }

    @When("^I click first checkbox recipe$")
    public void iClickFirstCheckboxRecipe() throws Throwable {
        foodSearch.clickCategoryFilter(1);
    }

    @Then("^I should see recipe in results$")
    public void iShouldSeeRecipeInResults() throws Throwable {
        String filterName = foodSearch.dishesFilter.get(1).getText();
        wait.until(ExpectedConditions.visibilityOf(foodSearch.articleName));
        assertTrue(filterName.contains(foodSearch.articleName.getText()));
    }

    @When("^I click add to favourites$")
    public void iClickAddToFavourites() throws Throwable {
        foodRecipe.addToFavouritesButton.click();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String favouritesText) throws Throwable {
        assertTrue(foodRecipe.addToFavouritesButton.getText().equals(favouritesText));
    }

    @When("^I click your favourites button$")
    public void iClickYourFavouritesButton() throws Throwable {
        foodRecipe.favouritesButton.click();
    }

    @Then("^I should see recipe in favourites$")
    public void iShouldSeeRecipeInFavourites() throws Throwable {
        favouritesPage.waitForVisibility(favouritesPage.favouriteItemsText);
        assertTrue(favouritesPage.recipeContainer.isDisplayed());
    }

    @When("^I click cross button$")
    public void iClickCrossButton() throws Throwable {
        favouritesPage.crossButton.click();
    }

    @When("^I click remove button$")
    public void iClickRemoveButton() throws Throwable {
        favouritesPage.waitForVisibility(favouritesPage.favouritesRemoveButton);
        favouritesPage.favouritesRemoveButton.click();
    }

    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String startAddingThings) throws Throwable {
        favouritesPage.waitForVisibility(favouritesPage.addToFavouritesButton);
        assertTrue(favouritesPage.noRecipesText.equals(startAddingThings));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
