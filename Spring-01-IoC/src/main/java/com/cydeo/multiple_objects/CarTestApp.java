package com.cydeo.multiple_objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTestApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CarConfig.class);

        Car car2 = container.getBean("c2",Car.class);

        System.out.println("car2 = " + car2.getMake());

        Car car = container.getBean(Car.class);
        System.out.println("car = " + car);


    }
}
