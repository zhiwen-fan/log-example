package com.bruce.log.example;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bruce on 2019/1/17.
 */
public class sl4jLogbackExample {
    final static Logger log = LoggerFactory.getLogger(sl4jLogbackExample.class);

    public static void main(String[] args) {
        log.info("test log info");
        log.error("one error occurred");

        new LogTest().log();
    }
}
