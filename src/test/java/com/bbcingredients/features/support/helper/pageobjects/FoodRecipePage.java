package com.bbcingredients.features.support.helper.pageobjects;

import com.bbcingredients.features.support.helper.util.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class FoodRecipePage extends LoadableComponent <FoodRecipePage> {

    private WebDriver driver;

    public FoodRecipePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void load() {
        driver.get("http://www.bbc.co.uk/food/recipes/easy_spaghetti_bolognese_93639");
    }

    protected void isLoaded() throws Error {
        assertTrue(driver.getCurrentUrl().contains("recipes"));
    }

    @FindBy(css = ".recipe-ingredients")
    public WebElement recipeIngredients;

    @FindBy(css = ".recipe-method")
    public WebElement receipeMethod;

    @FindBy(id = "searchInput-large")
    private WebElement recipeSearchBox;

    @FindBy(id = "recipe-finder-search-button")
    private WebElement searchButton;

    @FindBy(id = "add-to-favourites-button")
    private WebElement addToFavouritesButton;

    @FindBy(css = ".main-menu__link")
    public WebElement yourFavourites;

    @FindBys({
       @FindBy(id = "article-list"),
       @FindBy(css = "ul"),
       @FindBy(css = "li"),
       @FindBy(css = "h3")
    })
    private List<WebElement> articleText;

    public List<String> allArticleText(){
        ArrayList<String> allText = new ArrayList<String>();
        for(WebElement recipeText: articleText){
            allText.add(recipeText.getText().toLowerCase());
        }
        return allText;
    }

    public void searchRecipe(String searchText){
        recipeSearchBox.sendKeys(searchText);
        searchButton.click();
    }

    public void addToFavourites(){
        addToFavouritesButton.click();
        WaitHelper.waitForTextToAppear(driver,"Added to favourite",addToFavouritesButton);
    }
}
