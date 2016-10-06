package com.bbcingredients.features.support.helper.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private Properties properties = new Properties();
    private InputStream inputStream = null;
    private String pathToProperties = "src/test/java/com/bbcingredients/features/config/config.properties";

    public PropertyReader(){
        loadProperties();
    }

    private void loadProperties(){
        try{
            inputStream = new FileInputStream(pathToProperties);
            properties.load(inputStream);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String readProperty(String key){
        return properties.getProperty(key);
    }
}
