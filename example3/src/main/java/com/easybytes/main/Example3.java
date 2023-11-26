package com.easybytes.main;

import com.easybytes.beans.Vehicle;
import com.easybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle value from spring is : " + vehicle.getName());

        Vehicle vehicle1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle1 value from spring is : " + vehicle1.getName());

        Vehicle vehicle2 = context.getBean("nissanVehicle", Vehicle.class);
        System.out.println("Vehicle2 value from spring is : " + vehicle2.getName());
    }
}
