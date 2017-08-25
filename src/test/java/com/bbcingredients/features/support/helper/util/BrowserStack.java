package com.bbcingredients.features.support.helper.util;

import com.bbcingredients.features.support.helper.BrowserStackBrowsers;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;

public class BrowserStack {

    private String url;
    private DesiredCapabilities caps;
    private String automateKey;
    private GsonBuilder gsonBuilder = new GsonBuilder();
    private Gson gson = gsonBuilder.create();
    private BufferedReader reader;

    public BrowserStack(){
//        browserJson();
        String userName = new PropertyReader().readBrowserStackProperty("browser_stack_username");
        this.automateKey = new PropertyReader().readBrowserStackProperty("automateKey");
        setUrl(userName,automateKey);
    }

    private void setUrl(String userName, String automateKey){
        url = "https://" + userName + ":" + automateKey + "@hub-cloud.browserstack.com/wd/hub";
    }

    private void desiredCapabilities(){
        caps = new DesiredCapabilities();
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "49.0");
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Yosemite");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("browserstack.local", "true");
        caps.setCapability("browserstack.video", "false");
        caps.setCapability("acceptSslCerts", "true");
    }

    public void setUpLocalServer(){
        String browserStackBinary = "src/test/java/com/bbcingredients/features/support/helper/browserstack/BrowserStackLocal --force " + automateKey;
        ExecuteShell.executeCommand(browserStackBinary);
        System.out.print("helo you");
    }

    public String getUrl(){
        return url;
    }

    public DesiredCapabilities getCaps(){
        desiredCapabilities();
        return caps;
    }

    public void browserJson(){
        try{
          reader = new BufferedReader(new FileReader("src/test/java/com/bbcingredients/features/config/browser.json"));
            BrowserStackBrowsers[] browserStackBrowsers = gson.fromJson(reader, BrowserStackBrowsers[].class);
            for (BrowserStackBrowsers browser: browserStackBrowsers){
                System.out.println(browser.getBrowser());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
