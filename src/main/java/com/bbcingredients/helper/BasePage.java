package com.bbcingredients.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebElement wait;
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static String baseUrl(){
        String url = "http://www.bbc.co.uk";
        return url;
    }

    public void waitForVisibility(WebElement element) throws Error {
        wait = new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOf(element));
    }
}
