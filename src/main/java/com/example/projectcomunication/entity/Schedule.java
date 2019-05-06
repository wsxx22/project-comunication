package com.example.projectcomunication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "schedule")
public class Schedule extends AbstractEntity {

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_start_stop")
    private Stop startStop;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_end_stop")
    private Stop endsStop;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_line")
    private Line line;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_vehicle")
    private Vehicle vehicle;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_driver")
    private Driver driver;

    private LocalDateTime startsAt;

    private LocalDateTime endsAt;

}
