package com.me.TryCheckstyle;

import java.util.logging.Logger;

public class LogMessages {

    private static final Logger LOGGER = Logger.getLogger(LogMessages.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello, World!");
        if (false) {
            LOGGER.severe("Should never come to here");
        } else {
            LOGGER.info("correct");
        }
    }

}
