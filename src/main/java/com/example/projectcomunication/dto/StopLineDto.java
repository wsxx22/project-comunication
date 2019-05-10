package com.example.projectcomunication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StopLineDto {

    private String stop;

    private String line;

    private String day;

    private LocalTime time;

}
