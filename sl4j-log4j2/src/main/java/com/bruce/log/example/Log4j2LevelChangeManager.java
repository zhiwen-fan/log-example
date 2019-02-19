package com.bruce.log.example;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configurator;

/**
 * Created by bruce on 2019/2/19.
 */
public class Log4j2LevelChangeManager {

    public static void changeLevel(String loggerName, String level) {
        //LoggerContext.getContext(false).getLogger(loggerName).setLevel(Level.toLevel(level));
        Configurator.setLevel(loggerName,Level.toLevel(level));
    }

    public static void changeRootLevel(String level) {
        Configurator.setRootLevel(Level.toLevel(level));
    }
}
