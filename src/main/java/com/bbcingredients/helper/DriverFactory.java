package com.bbcingredients.helper;


import com.bbcingredients.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory(){
        if(getDriver() == null){
            createNewDriverInstance();
        }
    }

    private static void createNewDriverInstance(){
        String browser = new PropertyReader().readProperty("browser");
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else{
            System.out.println("Cannot read browser type");
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void destroyDriver(){
        driver.quit();
    }
}
