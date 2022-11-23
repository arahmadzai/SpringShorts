package com.cydeo.config;

import com.cydeo.bean_annotation.FullTimeEmployee;
import com.cydeo.bean_annotation.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean
    PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
