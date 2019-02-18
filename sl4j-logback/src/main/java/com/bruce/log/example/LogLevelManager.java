package com.bruce.log.example;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;

/**
 * Created by bruce on 2019/2/18.
 */
public class LogLevelManager {

    private static LoggerContext loggerContext = null;

    public static void changeRootLevel(String level) {
        changeLevel("root",level);
    }

    public static void changeLevel(String logName, String level) {
        getLogContext().getLogger(logName).setLevel(Level.toLevel(level));
    }

    public synchronized static LoggerContext getLogContext() {
        if(null == loggerContext) {
            loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        }

        return loggerContext;
    }
}
