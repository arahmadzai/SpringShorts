package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "players")
public class Player extends BaseEntity{

    private String firstName;
    private String lastName;
    private int dateOfBirth;

    @ManyToOne
    private Team team;
}
