package com.cognizant.spring_rest_learn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_rest_learn.model.Country;
import com.cognizant.spring_rest_learn.model.CountryList;

@Service
public class CountryService {

    public Country getCountry(String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        CountryList countryList =
                context.getBean("countryList", CountryList.class);

        List<Country> countries = countryList.getCountryList();

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                ((ClassPathXmlApplicationContext) context).close();
                return country;
            }
        }

        ((ClassPathXmlApplicationContext) context).close();
        return null;
    }
}