package com.easybytes.beans;


import com.easybytes.services.VehicleServices;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component(value = "vehicleBean")
public class Vehicle {
    private String name = "Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices){
            this.vehicleServices = vehicleServices;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

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
