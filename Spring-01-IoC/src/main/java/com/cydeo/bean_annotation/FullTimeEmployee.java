package com.cydeo.bean_annotation;

public class FullTimeEmployee extends Employee{

    @Override
    public void creatAccount() {
        System.out.println("full time employee created");
    }
}
