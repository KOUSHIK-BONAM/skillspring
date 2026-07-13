package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.Ex1BookService;

public class Ex1App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ex1Context.xml");

        Ex1BookService service =
                (Ex1BookService) context.getBean("ex1BookService");

        service.serviceMethod();
    }
}