package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coaches")
public class Coach extends BaseEntity{

    private String firstName;
    private String lastName;
    private int yearsOfExperience;

    @OneToOne(mappedBy = "coach")
    private Team team;

}
