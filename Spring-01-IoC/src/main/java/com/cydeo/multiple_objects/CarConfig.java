package com.cydeo.multiple_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {

    @Bean
    @Primary
//  @Bean(name = "c1")
    Car car1(){
        Car car = new Car();
        car.setMake("Lexus");

        return car;
    }

    @Bean("c2")
    Car car2(){
        Car car = new Car();
        car.setMake("Mercedez");

        return car;
    }

    @Bean(name = "c3")
    Car car3(){
        Car car = new Car();
        car.setMake("BMW");

        return car;
    }
}
