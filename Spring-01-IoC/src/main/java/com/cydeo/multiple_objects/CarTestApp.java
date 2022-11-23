package com.cydeo.multiple_objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTestApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CarConfig.class);




    }
}
