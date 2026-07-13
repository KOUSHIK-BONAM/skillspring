package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        logger.info("========================================");
        logger.info("Starting SpringLearnApplication...");
        logger.info("========================================");

        SpringApplication.run(SpringLearnApplication.class, args);

        displayCountries();

        logger.info("========================================");
        logger.info("SpringLearnApplication started successfully!");
        logger.info("========================================");
    }

    public static void displayCountries() {
        logger.debug("---- displayCountries() started ----");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        for (Country country : countryList) {
            logger.debug("Country: {}", country);
        }

        logger.debug("---- displayCountries() completed ----");
    }
}


