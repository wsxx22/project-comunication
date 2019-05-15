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

    @EmbeddedId
    private StopLineId id;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    //@JoinColumn(name = "id_stop")
    @MapsId("idStop")
    private Stop stop;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    //@JoinColumn(name =  "id_line")
    @MapsId("idLine")
    private Line line;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name =  "id_day_of_week")
    private Day day;

    private LocalTime time;

    public StopLine(Stop stop, Line line, Day day, LocalTime time) {
        this.stop = stop;
        this.line = line;
        this.day = day;
        this.time = time;

        id = new StopLineId(stop.getId(), line.getId());
    }
}
