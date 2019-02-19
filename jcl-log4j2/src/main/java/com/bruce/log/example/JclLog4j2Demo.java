package com.bruce.log.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by bruce on 2019/2/19.
 */
public class JclLog4j2Demo {
    private static Log log = LogFactory.getLog(JclLog4j2Demo.class);

    public static void main(String[] args) {
        log.info("jcl info log");
        log.debug("jcl debug log");
    }
}
