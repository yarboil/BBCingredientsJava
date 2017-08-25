package com.bbcingredients.features.support.helper;

import com.bbcingredients.features.support.helper.util.BrowserStack;
import com.bbcingredients.features.support.helper.util.ExecuteShell;
import cucumber.api.java.Before;
import org.junit.BeforeClass;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hooks extends Thread {

    private Thread browserStackThread;
    static Thread mainThread = new Thread();

    @Before
    public void setUpThread(){
      mainThread = currentThread();
      browserStackThread = new Thread() {
          public void run(){
              BrowserStack browser = new BrowserStack();
              browser.setUpLocalServer();
          }
      };
        browserStackThread.run();
    }

    @Before
    public void setUp(){
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);
    }
}
