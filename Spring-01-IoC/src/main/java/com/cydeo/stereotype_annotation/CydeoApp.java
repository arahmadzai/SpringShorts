package com.cydeo.stereotype_annotation;

import com.cydeo.bean_annotation.PartTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CourseConfig.class);

        Java java = container.getBean(Java.class);
        java.getTeachingHours();

        Agile agile = container.getBean(Agile.class);
        agile.getTeachingHours();

        Selenium selenium = container.getBean(Selenium.class);
        selenium.getTeachingHours();

        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.creatAccount();

    }
}
