package com.s1.showcase.production;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class ProcessApplication {

    private static Logger logger = LoggerFactory.getLogger(ProcessApplication.class);

    public static void main(String... args) {
        SpringApplication.run(ProcessApplication.class, args);
        logger.info("*********************************************");
        logger.info("***** CAMUNDA DEMO UP AND RUNNING");
        logger.info("*********************************************");
    }
}
