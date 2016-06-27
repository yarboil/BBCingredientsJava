package com.bbcingredients.util;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumSetup {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

    {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, "true");

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
