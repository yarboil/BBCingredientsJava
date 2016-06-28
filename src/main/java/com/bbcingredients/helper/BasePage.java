package com.bbcingredients.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static String baseUrl(){
        String url = "http://www.bbc.co.uk";
        return url;
    }
}
