package com.hg.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("start application...");
        for (int i = 1; i <= 10; i++) {
            logger.warn("begin task {}...", i);
        }
        logger.info("done.");
        System.out.println("Hello World!");
        Class cls = String.class;
        System.out.println(cls);
        long val = User.fact(1);
        System.out.println(val);

    }
}