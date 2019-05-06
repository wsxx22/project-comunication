package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "stops")
public class Stop extends AbstractEntity {

    private String name;

    private String latitude;

    private String longitude;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_transport_type")
    private TransportType transportType;

}
