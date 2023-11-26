package com.easybytes.config;


import com.easybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(value = "hondaVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("nissanVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Nissan");
        return veh;

    }
}
