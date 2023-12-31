package com.example.beans.main;

import com.example.beans.beans.Vehicle;
import com.example.beans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda city");
        System.out.println("Vehicle from non-spring context is : " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle from spring context is : " + vehicle.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from vehicle : " + hello);
        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value from vehicle : " + number);
    }
}
