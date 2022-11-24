package com.cydeo.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Selenium {

    public void getTeachingHours(){
        System.out.println("Java weekly teaching hours = " + 10);
    }
}
