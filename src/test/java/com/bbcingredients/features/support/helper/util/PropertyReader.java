package com.bbcingredients.features.support.helper.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private Properties properties = new Properties();
    private InputStream inputStream = null;

    public PropertyReader(){
        loadProperties();
        loadBrowserStack();
    }

    private void loadProperties(){
        String browserProperties = "src/test/java/com/bbcingredients/features/config/config.properties";
        try{
            inputStream = new FileInputStream(browserProperties);
            properties.load(inputStream);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void loadBrowserStack(){
        String browserStackProperties = "src/test/java/com/bbcingredients/features/config/browserstack.properties";
        try{
            inputStream = new FileInputStream(browserStackProperties);
            properties.load(inputStream);
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    public String readProperty(String key){
        return properties.getProperty(key);
    }

    public String readBrowserStackProperty(String key){
        return properties.getProperty(key);
    }
}
