package com.cydeo.bean_annotation;

import com.cydeo.config.AnotherConfig;
import com.cydeo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring01IoCApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring01IoCApplication.class, args);

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, AnotherConfig.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);

        ft.creatAccount();
        pt.creatAccount();

        String str = container.getBean(String.class);
        System.out.println("str = " + str);
        Integer integer = container.getBean(Integer.class);
        System.out.println("integer = " + integer);


    }

}
