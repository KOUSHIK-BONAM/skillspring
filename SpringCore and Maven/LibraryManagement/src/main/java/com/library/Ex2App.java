package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.Ex2BookService;

public class Ex2App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ex2Context.xml");

        Ex2BookService service =
                (Ex2BookService) context.getBean("ex2BookService");

        service.serviceMethod();
    }
}