package com.easybytes.main;

import com.easybytes.beans.Person;
import com.easybytes.beans.Vehicle;
import com.easybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);


//
        System.out.println(STR. "Person name from spring context is : \{ person.getName() }" );
        vehicle.setName("Toyota");
        System.out.println(STR. "Vehicle name from spring context is : \{ vehicle.getName() }" );
        System.out.println(STR. "Vehicle that person own is : \{ person.getVehicle() }" );
    }
}