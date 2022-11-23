package com.cydeo.bean_annotation;

public class PartTimeEmployee extends Employee{

    @Override
    public void creatAccount() {
        System.out.println("part time employee created");
    }
}
