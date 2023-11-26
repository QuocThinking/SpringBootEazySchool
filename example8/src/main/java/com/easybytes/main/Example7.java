package com.easybytes.main;

import com.easybytes.beans.Vehicle;

import com.easybytes.config.ProjectConfig;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7 {
    public static void main(String[] args) {

//        var context = new ClassPathXmlApplicationContext("beans.xml");
//        Vehicle vehicle = context.getBean(Vehicle.class);
//        System.out.println(STR."Vehicle value from spring : \{vehicle.getName()}");
//        System.out.println(STR."Vehicle value email from spring : \{vehicle.getEmail()}");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> hondaSupplier = () -> {
            Vehicle honda = new Vehicle();
            honda.setName("Honda");
            honda.setEmail("honda@gmail.com");
            return honda;
        };
        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            audi.setEmail("audi@gmail.com");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(STR."RandomNumber : \{randomNumber}");
        if(randomNumber % 2 == 0){
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }else{
            context.registerBean("honda", Vehicle.class, hondaSupplier);
        }

        Vehicle hondaVehicle = null;
        Vehicle audiVehicle = null;

        try {
            hondaVehicle = context.getBean("honda", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException)
        {
            System.out.println("Error while creating Honda vehicle");
        }
        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi vehicle");
        }

        if(hondaVehicle != null){
            System.out.println(STR."Programing Honda value from spring : \{hondaVehicle.getName()} and \{hondaVehicle.getEmail()}");
        }else{
            System.out.println(STR."Programing Vehicle value from spring : \{audiVehicle.getName()} and \{audiVehicle.getEmail()}");
        }

    }
}
