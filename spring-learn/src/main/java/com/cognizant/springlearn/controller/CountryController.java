package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    private final ApplicationContext xmlContext =
            new ClassPathXmlApplicationContext("country.xml");

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        logger.debug("---- getCountryIndia() started ----");
        Country india = (Country) xmlContext.getBean("in");
        logger.debug("---- getCountryIndia() completed ----");
        return india;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        logger.debug("---- getAllCountries() started ----");

        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) xmlContext.getBean("countryList");

        logger.debug("---- getAllCountries() completed ----");
        return countryList;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        logger.debug("---- getCountry() started, code={} ----", code);
        Country result = countryService.getCountry(code);
        logger.debug("---- getCountry() completed ----");
        return result;
    }
}
