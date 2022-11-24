package com.cydeo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mentor")
public class MentorHoursService implements ExtraSessions{

    @Override
    public Integer getHours() {
        return 8;
    }
}
