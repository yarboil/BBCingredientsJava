package com.bbcingredients.pageobjects;

import com.bbcingredients.helper.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodRecipe extends BasePage {

    public FoodRecipe(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".recipe-finder__q-e-checkbox")
    public WebElement firstCheckbox;

    @FindBy(css = ".recipe-finder__search-button")
    public WebElement searchIcon;

    @FindBy(css = "#add-to-favourites-button")
    public WebElement addToFavouritesButton;

    @FindBy(css = ".main-menu__item.main-menu__item--favorites")
    public WebElement favouritesButton;
}