package com.cydeo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Office")
public class OfficeHoursService implements ExtraSessions{

    @Override
    public Integer getHours() {
        return 5;
    }
}
