package com.bbcingredients.helper;


import com.bbcingredients.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory(){
        initialize();
    }

    public void initialize(){
        if(driver == null){
            createNewDriverInstance();
        }
    }

    private void createNewDriverInstance(){
        String browser = new PropertyReader().readProperty("browser");
        if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }else{
            System.out.println("Cannot read browser type");
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void destoryDriver(){
        driver.quit();
        driver = null;
    }
}
