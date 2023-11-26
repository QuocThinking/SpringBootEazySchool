package com.easybytes.main;

import com.easybytes.beans.Person;
import com.easybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the person bean from Spring Context");
        System.out.println("After retrieving the person bean from Spring Context");
        Person person = context.getBean(Person.class);
    }
}