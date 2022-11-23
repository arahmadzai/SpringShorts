package com.cydeo.bean_annotation;

import org.springframework.stereotype.Component;

@Component
public class PartTimeEmployee extends Employee{

    @Override
    public void creatAccount() {
        System.out.println("part time employee created");
    }
}
