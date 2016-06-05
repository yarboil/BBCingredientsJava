package com.bbcingredients.pageobjects;

import com.bbcingredients.helper.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FoodSearch extends BasePage {

    public FoodSearch(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#article-list")
    public WebElement articleList;

    @FindBys({
       @FindBy(css = "#filter-results h3")
    })
    public List<WebElement> recipeFinder;

    @FindBys({
       @FindBy(css = "#dishes-filters"),
       @FindBy(css = "ul li")
    })
    public List<WebElement> dishesFilter;

    @FindBy(css = "#dishes-filters ul li a")
    public List<WebElement>checkBox;

    @FindBy(css = "div#queryBox h2 a")
    public WebElement articleName;

    public void clickCategoryFilter(int indexNumber){
        checkBox.get(indexNumber).click();
    }
}
