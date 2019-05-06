package com.example.projectcomunication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleDto {

    private Long startStopId;

    private Long endStopId;

    private Long lineId;

    private Long vehicleId;

    private Long driverId;

    private LocalDateTime startsAt;

    private LocalDateTime endsAt;

}
