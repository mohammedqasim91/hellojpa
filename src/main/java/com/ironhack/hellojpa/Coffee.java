package com.ironhack.hellojpa;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "coffees")
@ToString

public class Coffee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;


    @Column(name = "coffee_name")
    private String name;
    private String origin;

    public Coffee (String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

}
