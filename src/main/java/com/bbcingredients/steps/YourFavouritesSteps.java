package com.bbcingredients.steps;

import com.bbcingredients.helper.BasePage;
import com.bbcingredients.helper.DriverFactory;
import com.bbcingredients.pageobjects.YourFavouritesPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class YourFavouritesSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp(){
        driver = new DriverFactory().getDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @Then("^I should see recipe in favourites$")
    public void iShouldSeeRecipeInFavourites() throws Throwable {
        assertTrue(new YourFavouritesPage(driver).recipeContainer.isDisplayed());
    }

    @When("^I click cross button$")
    public void iClickCrossButton() throws Throwable {
        new BasePage(driver).waitForVisibility(new YourFavouritesPage(driver).crossButton);
        new YourFavouritesPage(driver).crossButton.click();
    }

    @When("^I click remove button$")
    public void iClickRemoveButton() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(new YourFavouritesPage(driver).favouritesRemoveButton));
        new YourFavouritesPage(driver).favouritesRemoveButton.click();
    }
}