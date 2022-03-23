package com.example.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class LogApplication {
    private static final Logger logger= LoggerFactory.getLogger(LogApplication.class);
    public static void main(String[] args) {
        logger.trace("this is a info message");
        logger.info("this is a warn message");
        logger.error("this is a error message");
        System.out.println("hi");
        SpringApplication.run(LogApplication.class, args);
    }

}
