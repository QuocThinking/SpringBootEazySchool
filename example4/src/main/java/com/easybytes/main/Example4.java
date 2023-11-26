package com.easybytes.main;

import com.easybytes.beans.Vehicle;
import com.easybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {

        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        Vehicle veh1 = new Vehicle();
        veh1.setName("Yamaha");
        System.out.println(veh.getName());
        System.out.println(veh1.getName());


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle value from spring is : " + vehicle.getName());
    }
}
