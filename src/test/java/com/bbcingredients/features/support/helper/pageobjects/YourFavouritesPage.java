package com.bbcingredients.features.support.helper.pageobjects;

import com.bbcingredients.features.support.helper.util.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourFavouritesPage {

    private WebDriver driver;

    public YourFavouritesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".my-favourites-recipes__recipe-container")
    private WebElement recipeContainer;

    @FindBy(className = "favourites-drawer__update")
    private WebElement removeRecipe;

    @FindBy(css = ".favourites-drawer__button.favourites-drawer__button--remove")
    private WebElement drawerRemove;

    @FindBy(id = "add-to-favourites-button")
    private WebElement addtoFavouritesButton;

    @FindBy(className = "my-favourites-recipes__no-recipes")
    private WebElement favouriteRecipeeText;

    public boolean isFavouriteRecipeDisplayed(){
        WaitHelper.waitForElementToDisplay(driver, recipeContainer);
        return recipeContainer.isDisplayed();
    }

    public void removeRecipe(){
        removeRecipe.click();
        WaitHelper.waitForElementToDisplay(driver, drawerRemove);
        drawerRemove.click();
    }

    public void addToFavourites(){
        WaitHelper.waitForTextToAppear(driver,"Start adding things wherever you see",favouriteRecipeeText);
        addtoFavouritesButton.click();
    }



}
