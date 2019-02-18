package com.bruce.log.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bruce on 2019/2/18.
 */
public class DynamicChangeLogLevel {
    private static Logger log = LoggerFactory.getLogger(DynamicChangeLogLevel.class);

    public static void main(String[] args) {
        log.debug("this is debug");
        LogTest logTest = new LogTest();
        logTest.log();

        LogLevelManager.changeRootLevel("debug");
        LogLevelManager.changeLevel("com.bruce.log.example.LogTest","info");
        log.debug("this is debug after change log level");
        logTest.log();
    }
}
