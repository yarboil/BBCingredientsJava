package com.bbcingredients.pageobjects;

import com.bbcingredients.helper.BasePage;
import com.sun.tracing.dtrace.FunctionName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodIngredientsPage {

    protected WebDriver driver;

    public FoodIngredientsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "img#food-image")
    public WebElement foodImage;

    @FindBy(css = "div.caption h2 a")
    public WebElement foodCaption;

    @FindBy(css = "div.caption p")
    public WebElement foodAuthor;

    @FindBy(css = "div.module.grouped-resource-list-module h3")
    public WebElement accordionHeader;

    @FindBy(css = "h3.accordion-header.accordion-header-closed")
    public WebElement secondAccordionHeader;

    @FindBy(css = "ul.resources")
    public WebElement content;

    @FindBy(css = "li.with-image")
    public WebElement accordionImage;

    @FindBy(css = "img.recipes-image")
    public WebElement mobileFoodImage;

    @FindBy(css = "div#header.module.with-more p")
    public WebElement mobileFoodAuthor;

    @FindBy(css = "div#header.module.with-more a")
    public WebElement mobileFoodCaption;
}
