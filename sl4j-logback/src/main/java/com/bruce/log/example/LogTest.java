package com.bruce.log.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bruce on 2019/1/22.
 */
public class LogTest {
    Logger logger = LoggerFactory.getLogger(LogTest.class);
    public void log() {
        logger.debug("debug log test");
        logger.info("info log test");
    }
}
