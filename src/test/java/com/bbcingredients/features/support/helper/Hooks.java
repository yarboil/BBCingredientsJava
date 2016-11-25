package com.bbcingredients.features.support.helper;

import com.bbcingredients.features.support.helper.util.BrowserStack;
import cucumber.api.java.Before;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hooks {

    @Before
    public void setUp(){
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);
    }
}
