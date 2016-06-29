package com.bbcingredients.pageobjects;

import com.bbcingredients.helper.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FoodRecipePage {

    protected WebDriver driver;
    static ArrayList<String> ingredientsRecipes = new ArrayList<String>();

    public FoodRecipePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".recipe-finder__q-e-checkbox")
    public WebElement firstCheckbox;

    @FindBy(css = ".recipe-finder__search-button")
    public WebElement searchIcon;

    @FindBy(css = "button#add-to-favourites-button")
    public WebElement addToFavouritesButton;

    @FindBy(css = "nav.main-menu__navigation ul li a")
    public List<WebElement> favouritesButton;

    @FindBy(css = "#on-this-page ul li a")
    public WebElement buyersGuide;

    @FindBy(css = ".recipe-ingredients__list li ")
    public  List<WebElement> ingredientsList;

    @FindBy(css = "#shopping-list-link.recipe-actions-link")
    public WebElement shoppingList;

    public List getIngredientsList(){
        for(WebElement ingredients: ingredientsList){
            ingredientsRecipes.add(ingredients.getText());
        }
        Collections.sort(ingredientsRecipes);
        return ingredientsRecipes;
    }

    public static List getIngredients(){
        return ingredientsRecipes;
    }

    public void clickYourFavouritesButton() throws InterruptedException {
        favouritesButton.get(11).click();
    }
}
