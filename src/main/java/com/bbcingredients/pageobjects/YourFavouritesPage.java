package com.bbcingredients.pageobjects;

import com.bbcingredients.helper.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourFavouritesPage extends BasePage {

    public YourFavouritesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".my-favourites-recipes__recipe-container")
    public WebElement recipeContainer;

    @FindBy(css = "button.favourites-drawer__update")
    public WebElement crossButton;

    @FindBy(css = ".favourites-drawer__button-text")
    public WebElement favouritesRemoveButton;

    @FindBy(css = "#add-to-favourites-button")
    public WebElement addToFavouritesButton;
}
