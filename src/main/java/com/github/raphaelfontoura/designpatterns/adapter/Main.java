package com.github.raphaelfontoura.designpatterns.adapter;

public class Main {
    
    public static void main(String[] args) {
        Logger logger = Logger.create();
        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.log("This is a log message");
    }
}
