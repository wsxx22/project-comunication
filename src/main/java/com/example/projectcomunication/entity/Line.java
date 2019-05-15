package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;

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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "line")
    @OrderBy("position")
    //@JoinColumn(name = "id_line")
    private List<LineStop> linesStops = new ArrayList<>();

}
