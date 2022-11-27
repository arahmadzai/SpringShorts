package com.cydeo.entity;

import com.cydeo.enums.Country;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "teams")
public class Team extends BaseEntity{

    @Column(name = "teamName")
    private String name;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Transient
    private String founder;

    @OneToOne
    private Coach coach;

    @OneToMany(mappedBy = "team")
    private List<Player> player;
}
