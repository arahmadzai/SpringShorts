package com.cydeo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfig {

    @Bean
    String string(){
        return "Hello World";
    }

    @Bean
    Integer integer(){
        return 100;
    }
}
