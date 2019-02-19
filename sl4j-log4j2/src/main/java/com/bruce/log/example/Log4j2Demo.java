package com.bruce.log.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bruce on 2019/2/19.
 */
public class Log4j2Demo {
    private static Logger log = LoggerFactory.getLogger(Log4j2Demo.class);

    public static void main(String[] args) {
        log.debug("this is debug log");
        log.info("this is info log");
        log.warn("this is warn log");
        LogTest.log();
    }
}
