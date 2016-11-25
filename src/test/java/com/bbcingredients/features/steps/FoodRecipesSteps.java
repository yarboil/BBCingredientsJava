package com.bbcingredients.features.steps;

import com.bbcingredients.features.support.helper.DriverFactory;
import com.bbcingredients.features.support.helper.pageobjects.*;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FoodRecipesSteps extends DriverFactory {

    String recipe = "bolognese";

    @Given("^I am on recipe page$")
    public void iAmOnFoodSearch() throws Throwable {
        new FoodRecipePage(getDriver()).get();
    }

    @Then("^I should see ingredients list$")
    public void iShouldSeeIngredientsList() throws Throwable {
        assertTrue(new FoodRecipePage(getDriver()).recipeIngredients.isDisplayed());
    }

    @Then("^I should see method list$")
    public void iShouldSeeMethodList() throws Throwable {
        assertTrue(new FoodRecipePage(getDriver()).receipeMethod.isDisplayed());
    }

    @When("^I search for a recipe$")
    public void iSearchForARecipe() throws Throwable {
        new FoodRecipePage(getDriver()).searchRecipe(recipe);
    }

    @Then("^I should see recipes containing recipe$")
    public void iShouldSeeRecipesContainingRecipe() throws Throwable {
        FoodRecipePage foodRecipe = new FoodRecipePage(getDriver());
        for(String recipeText: foodRecipe.allArticleText()){
            assertTrue(recipeText.contains(recipe));
        }
    }

    @And("^I add to favourites$")
    public void iClickAddToFavourites() throws Throwable {
        new FoodRecipePage(getDriver()).addToFavourites();
    }

    @When("^I click to view favourites$")
    public void iClickToViewFavourites() throws Throwable {
        new CommonComponents(getDriver()).selectMainNavigation("Your Favourites");
    }

    @After
    public void tearDown(){
        destroyDriver();
    }
}
