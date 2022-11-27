package com.cydeo.entity;

import com.cydeo.enums.Level;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "leagues")
public class League extends BaseEntity{

    @Column(name = "leagueName")
    private String name;

    @Enumerated(EnumType.STRING)
    private Level level;

    private boolean isNational;
}
