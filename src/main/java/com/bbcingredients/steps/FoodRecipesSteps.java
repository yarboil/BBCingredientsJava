package com.bbcingredients.steps;

import com.bbcingredients.helper.BasePage;
import com.bbcingredients.helper.DriverFactory;
import com.bbcingredients.pageobjects.*;
import com.bbcingredients.util.PropertyReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class FoodRecipesSteps {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp(){
        driver = new DriverFactory().getDriver();
        wait = new WebDriverWait(driver, 40);
    }

    @After
    public void tearDown(){
        new DriverFactory().destoryDriver();
    }

    @Given("^I am on Food recipe page$")
    public void iAmOnFoodSearch() throws Throwable {
        driver.get(BasePage.baseUrl() + new PropertyReader().readProperty("receipespage"));
    }

    @When("^I click quick recipe finder first checkbox$")
    public void iClickQuickRecipeFinderFirstCheckbox() throws Throwable {
        new FoodRecipePage(driver).firstCheckbox.click();
    }

    @When("^I click search$")
    public void iClickSearch() throws Throwable {
        new FoodRecipePage(driver).searchIcon.click();
    }

    @When("^I click add to favourites$")
    public void iClickAddToFavourites() throws Throwable {
        new FoodRecipePage(driver).addToFavouritesButton.click();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String favouritesText) throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(new FoodRecipePage(driver).addToFavouritesButton));
        assertTrue(new FoodRecipePage(driver).addToFavouritesButton.getText().equals(favouritesText));
    }

    @When("^I click your favourites button$")
    public void iClickYourFavouritesButton() throws Throwable {
        new FoodRecipePage(driver).clickYourFavouritesButton();
    }
}
