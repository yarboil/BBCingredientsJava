package com.bbcingredients.features.support.helper.pageobjects;

import io.appium.java_client.pagefactory.OverrideWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import static org.junit.Assert.assertTrue;

public class FoodIngredientsPage extends LoadableComponent <FoodIngredientsPage> {

    private WebDriver driver;

    public FoodIngredientsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @Override
    public void load(){
        driver.get("https://www.bbc.com/food/broccoli");
    }

    @Override
    public void isLoaded() throws Error{
       assertTrue(driver.getCurrentUrl().contains("food"));
    }

    @FindBy(css = "img#food-image")
    public WebElement foodImage;

    @FindBy(css = "div.caption h2 a")
    public WebElement foodCaption;

    @FindBy(css = "div.caption p")
    public WebElement foodAuthor;

    @FindBy(css = ".module.grouped-resource-list-module h3")
    public WebElement accordionHeader;

    @FindBy(css = "h3.accordion-header.accordion-header-closed")
    public WebElement secondAccordionHeader;

    @FindBy(css = "li.with-image")
    public WebElement accordionImage;

    @FindBy(css = "img.recipes-image")
    public WebElement mobileFoodImage;

    @FindBy(css = "div#header.module.with-more p")
    public WebElement mobileFoodAuthor;

    @FindBy(css = "div#header.module.with-more a")
    public WebElement mobileFoodCaption;
}
