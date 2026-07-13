package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class OrmlearnApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmlearnApplication.class, args);

        CountryService service = context.getBean(CountryService.class);

        List<Country> countries = service.getAllCountries();

        for (Country c : countries) {
            System.out.println(c);
        }
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        employeeService.addEmployee(new Employee("Keerthi",25000));
        employeeService.addEmployee(new Employee("Rahul",30000));
        employeeService.addEmployee(new Employee("Vikram",40000));

    }
}