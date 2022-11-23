package com.cydeo.stereotype_annotation;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Course {

    private String name;

    public abstract void getTeachingHours();

}
