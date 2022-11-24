package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.service.JavaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        JavaService java = container.getBean(JavaService.class);

        java.getTeachingHours();

        JavaService java2 = container.getBean(JavaService.class);

        JavaService java3 = container.getBean(JavaService.class);

        System.out.println(java2);
        System.out.println(java3);

        System.out.println(java2==java3);

    }
}
