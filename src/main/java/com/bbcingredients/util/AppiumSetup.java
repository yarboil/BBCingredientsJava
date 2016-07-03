package com.bbcingredients.util;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class AppiumSetup {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

    {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
    }

    public AppiumSetup(){
        startService();
    }

    public DesiredCapabilities getCapabilities(){
        return capabilities;
    }

    public void startService(){
        service.start();
    }

    public void stopService(){
        if(service.isRunning()){
            service.stop();
        }
    }
}
