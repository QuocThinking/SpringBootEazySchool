package com.easybytes.main;

import com.easybytes.beans.Person;
import com.easybytes.beans.Vehicle;
import com.easybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {

     var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
     String[] persons = context.getBeanNamesForType(Person.class);
     Person person = context.getBean(Person.class);
     String[] vehicles = context.getBeanNamesForType(Vehicle.class);
     Vehicle vehicle = context.getBean(Vehicle.class);

     vehicle.getVehicleServices().playMusic();
     vehicle.getVehicleServices().movingVehicle();
     person.getVehicle().getVehicleServices().playMusic();

//        System.out.println("Person beans: ");
//        for(String person1 : persons){
//            System.out.println(person1);
//        }
//        System.out.println();
//
//        System.out.println("Vehicle beans : ");
//        for(String vehicle2 : vehicles){
//            System.out.println(vehicle2);
//        }

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}