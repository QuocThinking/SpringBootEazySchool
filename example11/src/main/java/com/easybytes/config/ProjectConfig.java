package com.easybytes.config;


import com.easybytes.beans.Person;
import com.easybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.easybytes.beans")
public class ProjectConfig {

}
