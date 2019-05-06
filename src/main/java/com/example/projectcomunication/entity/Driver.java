package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "drivers")
public class Driver extends AbstractEntity {

    private String name;
    private String surname;
    private String pesel;

}
