package com.cydeo.service;

import com.cydeo.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class JavaService{

    private final ExtraSessions mentorsHours;
    private final ExtraSessions officeHours;
    private final JavaRepository javaRepository;

    public JavaService(@Qualifier("Mentor") ExtraSessions mentorsHours, @Qualifier("Office") ExtraSessions officeHours, JavaRepository javaRepository) {
        this.mentorsHours = mentorsHours;
        this.officeHours = officeHours;
        this.javaRepository = javaRepository;
    }

    @Autowired


    public void getTeachingHours(){

        System.out.println("Weekly Java Hours: " + (javaRepository.returnHours() + officeHours.getHours() + mentorsHours.getHours()));

    }
}
