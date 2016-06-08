package com.bbcingredients;

import com.oracle.tools.packager.Log;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {
    static Logger logger = Logger.getLogger(TestLogger.class);

    public static void info(String message){
        BasicConfigurator.configure();
        logger.info(message);
    }

    public static void warn(String message){
        Log.info(message);
    }

    public static void error(String message){
        Log.info(message);
    }

    public static void fatal(String message){
        Log.info(message);
    }

    public static void debug(String message){
        Log.info(message);
    }

}
