package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "stops")
public class Stop extends AbstractEntity {

    @Column(unique = true)
    private String name;

    private String latitude;

    private String longitude;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_transport_type")
    private TransportType transportType;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_stop")
    List<StopLine> stopLines = new ArrayList<>();

    public Stop(String name, String latitude, String longitude, TransportType transportType) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.transportType = transportType;
    }
}
