package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "lines_stops")
public class LineStop implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_line")
    private Line line; // 2

    @Id
    @JoinColumn(name = "id_stop")
    @ManyToOne(cascade = CascadeType.ALL)
    private Stop stop; // nowodwory

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_end_stop")
    private Stop endStop; // mlociny

    private int position; // 1

}
