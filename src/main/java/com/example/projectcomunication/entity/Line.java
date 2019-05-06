package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "lines")
public class Line extends AbstractEntity{

    private String name;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private TransportType transportType;

}
