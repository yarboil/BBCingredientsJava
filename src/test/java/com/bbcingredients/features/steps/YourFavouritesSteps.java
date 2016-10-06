package com.bbcingredients.features.steps;

import com.bbcingredients.features.support.helper.DriverFactory;
import com.bbcingredients.features.support.helper.pageobjects.YourFavouritesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;

import static org.junit.Assert.assertTrue;

public class YourFavouritesSteps extends DriverFactory {

    @Then("^I should see recipe in favourites$")
    public void iShouldSeeRecipeInFavourites() throws Throwable {
        assertTrue(new YourFavouritesPage(getDriver()).isFavouriteRecipeDisplayed());
    }

    @When("^I remove from favourites$")
    public void iRemoveFromFavourites() throws Throwable {
        new YourFavouritesPage(getDriver()).removeRecipe();
    }

    @Then("^I should see add to favourites button$")
    public void iShouldSeeAddToFavouritesButton() throws Throwable {
        new YourFavouritesPage(getDriver()).addToFavourites();
    }

    @AfterClass
    public void tearDown(){
        destroyDriver();
    }
}
