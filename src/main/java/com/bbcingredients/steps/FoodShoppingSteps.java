package com.bbcingredients.steps;

import com.bbcingredients.helper.DriverFactory;
import com.bbcingredients.pageobjects.FoodRecipePage;
import com.bbcingredients.pageobjects.FoodShoppingListPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class FoodShoppingSteps {

    private WebDriver driver;

    @Before("@browser")
    public void setUp(){
        driver = new DriverFactory().getDriver();
    }

    @Then("^I should see ingredients list displayed$")
    public void iShouldSeeIngredientsListDisplayed() throws Throwable {
       assertArrayEquals(new FoodShoppingListPage(driver).shoppingList().toArray(),(FoodRecipePage.getIngredients().toArray()));
    }
}
