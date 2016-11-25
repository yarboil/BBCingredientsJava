package com.bbcingredients.features.support.helper.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CommonComponents {

    protected WebDriver driver;

    public CommonComponents(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBys({
            @FindBy(css = ".main-menu__navigation.main-menu__navigation--recipes"),
            @FindBy(css = "ul")
    })
    private WebElement mainNavigation;

    public void selectMainNavigation(String item){
        mainNavigation.findElement(By.linkText(item)).click();
    }
}
