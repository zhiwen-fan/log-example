package com.bruce.log.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bruce on 2019/2/19.
 */
public class DynamicChangeLog4j2LevelDemo {

    private static Logger log = LoggerFactory.getLogger(DynamicChangeLog4j2LevelDemo.class);

    public static void main(String[] args) {
        log.info("main info log");
        LogTest.log();
        Log4j2LevelChangeManager.changeLevel("com.bruce.log.example.LogTest","info");
        LogTest.log();
        Log4j2LevelChangeManager.changeRootLevel("error");
        log.info("main info log");
    }
}
