package com.example.projectcomunication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverDto {

    private Long id;
    private String name;
    private String surname;
    private String pesel;

}
