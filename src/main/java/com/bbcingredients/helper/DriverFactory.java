package com.bbcingredients.helper;


import com.bbcingredients.util.AppiumSetup;
import com.bbcingredients.util.PropertyReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    protected static WebDriver driver;
    protected static WebDriver mobileDriver;
    protected static AppiumSetup appiumSetup;

    public DriverFactory(){
        if(getDriver() == null){
            createNewDriverInstance();
        }
    }

    private static void createNewDriverInstance(){
        String browser = new PropertyReader().readProperty("browser");
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("mobile")){
            appiumSetup = new AppiumSetup();
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), appiumSetup.getCapabilities());
                mobileDriver = driver;
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

    public WebDriver getMobileDriver(){ return mobileDriver; }

    public void destroyDriver(){
        driver.quit();
        driver = null;
      if(mobileDriver != null){
          appiumSetup.stopService();
      }
    }
}
