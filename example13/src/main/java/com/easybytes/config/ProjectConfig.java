package com.easybytes.config;


import com.easybytes.beans.Person;
import com.easybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.easybytes.implementation", "com.easybytes.services"})
@ComponentScan(basePackageClasses = {com.easybytes.beans.Vehicle.class, com.easybytes.beans.Person.class})
public class ProjectConfig {




}
