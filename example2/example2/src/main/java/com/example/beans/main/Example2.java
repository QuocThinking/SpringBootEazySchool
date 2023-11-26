package com.example.beans.main;

import com.example.beans.beans.Vehicle;
import com.example.beans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda city");
        System.out.println("Vehicle from non-spring context is : " + vehicle.getName());

       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       Vehicle veh = context.getBean("vehicle",Vehicle.class);
       System.out.println("Vehicle from spring context is : " + veh.getName());

       Vehicle veh1 = context.getBean("vehicle2",Vehicle.class);
        System.out.println("Vehicle 2 from spring is context is : " + veh1.getName());

        Vehicle veh2 = context.getBean("vehicle3",Vehicle.class);
        System.out.println("Vehicle 3 from spring is context is : " + veh2.getName());


    }
}
