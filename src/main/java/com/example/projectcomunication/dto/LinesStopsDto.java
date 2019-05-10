package com.example.projectcomunication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinesStopsDto {

    private LineDto line;

    private String endStop;

    private int position;

    private StopDto stop;

}
