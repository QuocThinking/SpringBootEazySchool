package com.easybytes.main;

import com.easybytes.beans.Person;
import com.easybytes.beans.Vehicle;
import com.easybytes.config.ProjectConfig;
import com.easybytes.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {

     var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1 : " + vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " + vehicleServices2.hashCode());

        if(vehicleServices1 == vehicleServices2){
            System.out.println("VehicleService bean is a singleton scoped bean");
        }
    }
}