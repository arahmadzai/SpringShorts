package com.cydeo.stereotype_annotation;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
//@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Agile extends Course{

    @Override
    public void getTeachingHours() {
        System.out.println("Agile teaching hours = " +10);
    }

}
