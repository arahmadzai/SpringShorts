package com.cydeo.bean_annotation;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public abstract class Employee {

    public abstract void creatAccount();
}
