package com.cydeo.stereotype_annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Java extends Course{

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours = " +20);
    }
}
