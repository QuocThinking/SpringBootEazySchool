package com.easybytes.config;


import com.easybytes.beans.Person;
import com.easybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.easybytes.beans")
public class ProjectConfig {



    @Bean
    public Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }


    @Bean
    public Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }




}
