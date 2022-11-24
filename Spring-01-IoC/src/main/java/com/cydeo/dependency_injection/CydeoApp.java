package com.cydeo.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CourConfig.class);

        Java java = container.getBean(Java.class);

        java.getTeachingHours();

        Selenium selenium = container.getBean(Selenium.class);

        selenium.getTeachingHours();


    }
}
