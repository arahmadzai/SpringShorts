package com.cydeo.service;

import org.springframework.stereotype.Component;

@Component
public class MentorHoursService implements ExtraSessions{

    @Override
    public Integer getHours() {
        return 8;
    }
}
