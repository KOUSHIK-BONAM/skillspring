package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    private final ApplicationContext xmlContext =
            new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry(String code) {
        logger.debug("---- getCountry() started, code={} ----", code);

        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) xmlContext.getBean("countryList");

        Optional<Country> match = countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst();

        Country result = match.orElseThrow(() -> {
            logger.debug("No country found for code={}", code);
            return new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Country not found for code: " + code);
        });

        logger.debug("Match found: {}", result);
        logger.debug("---- getCountry() completed ----");
        return result;
    }
}

