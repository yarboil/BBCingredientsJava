package com.bbcingredients.features.support.helper;


import com.bbcingredients.features.support.helper.util.BrowserStack;
import com.bbcingredients.features.support.helper.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    protected static WebDriver driver;

    private static void createNewDriverInstance(){
        String browser = new PropertyReader().readProperty("browser");
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("headless")){
            driver = new HtmlUnitDriver();
        }else if(browser.equalsIgnoreCase("browserstack")){
            BrowserStack browserstack = new BrowserStack();
            try {
                driver = new RemoteWebDriver(new URL(browserstack.getUrl()), browserstack.getCaps());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Cannot read browser type: " + browser);
        }
    }

    public static WebDriver getDriver(){
        if(driver == null)  {
          createNewDriverInstance();
      }
        return driver;
    }

    public static void destroyDriver(){
        driver.close();
        driver.quit();
        driver = null;
    }
}
