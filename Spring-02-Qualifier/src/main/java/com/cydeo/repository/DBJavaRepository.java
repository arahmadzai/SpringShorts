package com.cydeo.repository;

import com.cydeo.model.Java;
import org.springframework.stereotype.Component;

@Component
public class DBJavaRepository implements JavaRepository{

    @Override
    public Integer returnHours() {

        //Assume java object is coming from DB
        Java java = new Java(30);
        return java.getTeachingHours();
    }
}
