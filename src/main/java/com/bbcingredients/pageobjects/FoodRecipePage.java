package com.bbcingredients.pageobjects;

import com.bbcingredients.helper.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FoodRecipePage {

    protected WebDriver driver;

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

    @FindBy(css = "nav.main-menu__navigation.main-menu__navigation--recipes.menu__navigation--shown ul li")
    public List<WebElement> favouritesButton;

    @FindBy(css = "#on-this-page ul li a")
    public WebElement buyersGuide;

    public void clickYourFavouritesButton(){
        System.out.println(favouritesButton);
        System.out.println(favouritesButton.get(5).getText());
    }
}
