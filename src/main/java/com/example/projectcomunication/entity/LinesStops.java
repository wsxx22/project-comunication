package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "lines_stops")
public class LinesStops {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_line")
    private Line line;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_end_stop")
    private Stop endStop;

    private int position;

    @JoinColumn(name = "id_stop")
    @ManyToOne(cascade = CascadeType.ALL)
    private Stop stop;

}
