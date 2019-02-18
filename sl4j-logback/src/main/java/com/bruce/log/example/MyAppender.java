package com.bruce.log.example;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.AppenderBase;

import java.text.SimpleDateFormat;


/**
 * Created by bruce on 2019/2/18.
 */
public class MyAppender extends AppenderBase<LoggingEvent> {
    protected void append(LoggingEvent event) {
        String level = event.getLevel().levelStr;
        String loggerName = event.getLoggerName();
        String message = event.getMessage();
        String threadName = event.getThreadName();
        StackTraceElement[] callerData = event.getCallerData();
        long time = event.getTimeStamp();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss/SSS");
        System.out.println("MyAppender log info: " +sdf.format(time)+ ", " + threadName + ", " + loggerName + ": " + callerData[0].getLineNumber() + ", "+ message);
    }
}
