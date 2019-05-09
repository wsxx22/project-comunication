package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "stop_lines")
public class StopLine implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_stop")
    private Stop stop;

    @Id
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name =  "id_line")
    private Line line;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name =  "id_day_of_week")
    private Day day;

    private LocalTime time;

}
