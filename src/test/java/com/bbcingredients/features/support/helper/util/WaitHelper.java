package com.bbcingredients.features.support.helper.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    static int durationToWait = 30;

    public static void waitForTextToAppear(WebDriver driver, String textToAppear, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, durationToWait);
        wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
    }

    public static void waitForElementToDisplay(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, durationToWait);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
