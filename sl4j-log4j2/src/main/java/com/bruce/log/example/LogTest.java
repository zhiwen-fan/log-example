package com.bruce.log.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bruce on 2019/2/19.
 */
public class LogTest {
    private static Logger log = LoggerFactory.getLogger(LogTest.class);

    public static void log() {
        log.debug("debug log for LogTest");
        log.info("info log for LogTest");
    }
}
