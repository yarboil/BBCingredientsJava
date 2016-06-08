package com.bbcingredients.helper;


import com.bbcingredients.pageobjects.FoodIngredients;
import com.bbcingredients.pageobjects.FoodRecipe;
import com.bbcingredients.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertEquals;

public class BasePage {
    protected WebDriver driver;
    protected WebElement wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    private String baseUrl(){
        String url = "http://www.bbc.co.uk";
        return url;
    }

    public FoodRecipe navigateToFoodRecipesPage(){
        driver.get(baseUrl() + "/food/recipes/easy_spaghetti_bolognese_93639");
        return new FoodRecipe(driver);
    }

    public FoodIngredients navigateToFoodIngredientsPage(){
        driver.get(baseUrl() + "/food/broccoli");
        assertEquals("BBC - Food - Broccoli recipes", driver.getTitle());
        return new FoodIngredients(driver);
    }

    public LoginPage navigateToLoginPage(){
        driver.get("https://ssl.bbc.co.uk/id/signin");
        return  new LoginPage((driver));
    }

    public void waitForVisibility(WebElement element) throws Error {
        wait = new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOf(element));
    }
}
