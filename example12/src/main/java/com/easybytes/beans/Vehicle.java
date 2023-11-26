package com.easybytes.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Vehicle {
    private String name;

    @Autowired
    private Person person;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void  printHello(){
        System.out.println("Printing hello Vehicle Component");
    }

    @Override
    public String toString() {
        return STR."Vehicle name is : \{name}";
    }
}
