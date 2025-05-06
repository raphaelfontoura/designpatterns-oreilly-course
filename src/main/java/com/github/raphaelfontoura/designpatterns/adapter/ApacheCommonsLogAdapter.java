package com.github.raphaelfontoura.designpatterns.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

public class ApacheCommonsLogAdapter extends Logger {
    private final Log logger = new Log4JLogger();

    @Override
    public void trace(String message) {
        logger.trace(message);
    }

    @Override
    public void debug(String message) {
        logger.debug(message);
    }

    @Override
    public void log(String message) {
        logger.info(message);
    }

}
