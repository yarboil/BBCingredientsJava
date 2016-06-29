package com.bbcingredients.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodShoppingListPage {

    protected WebDriver driver;

    public FoodShoppingListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        @FindBy(css = ".shopping-list__group p")
        private List<WebElement> shoppingListGroup;

        public List shoppingList(){
            ArrayList <String> lists = new ArrayList<String>();
            for(WebElement groupList: shoppingListGroup){
                lists.add(groupList.getText());
            }
            Collections.sort(lists);
            return lists;
        }
    }