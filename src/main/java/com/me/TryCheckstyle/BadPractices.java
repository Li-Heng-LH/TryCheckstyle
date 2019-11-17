package com.me.TryCheckstyle;

import java.util.logging.Logger;

public class BadPractices {

    private static final Logger LOGGER = Logger.getLogger(BadPractices.class.getName());

    public void sayHello() {
        BadMethod();
        System.out.println("Hello World");
        LOGGER.info("saying hello");
    }

    static private void BadMethod() {
        if (true)
            System.out.println("");

        else
            System.out.println("");
    }
}
