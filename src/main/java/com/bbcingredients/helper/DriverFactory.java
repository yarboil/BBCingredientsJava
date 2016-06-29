package com.bbcingredients.helper;


import com.bbcingredients.util.AppiumSetup;
import com.bbcingredients.util.PropertyReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    protected static WebDriver driver;
    protected static AndroidDriver mobileDriver;

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
        }else if(browser.equals("mobile")){
            AppiumSetup appiumSetup = new AppiumSetup();
            try {
                mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), appiumSetup.getCapabilities());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else{
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
