package com.easybytes.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle bean created by spring");
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void  printHello(){
        System.out.println("Printing hello from Vehicle Component");
    }

    @Override
    public String toString() {
        return STR."Vehicle name is : \{name}";
    }
}
