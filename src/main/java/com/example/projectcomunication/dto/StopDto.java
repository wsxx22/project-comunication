package com.example.projectcomunication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StopDto {

    private String name;

    private String latitude;

    private String longitude;

    private Long transportTypeId;

}
