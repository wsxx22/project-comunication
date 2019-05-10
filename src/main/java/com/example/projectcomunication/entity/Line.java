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
@Table(name = "lines")
public class Line extends AbstractEntity{

    private String name;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_transport_type")
    private TransportType transportType;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    List<LinesStops> linesStops = new ArrayList<>();

}
