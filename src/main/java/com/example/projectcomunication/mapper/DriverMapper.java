package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.DriverDto;
import com.example.projectcomunication.entity.Driver;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    DriverDto toDto (Driver driver);

    List<DriverDto> toDtoList (List<Driver> drivers);

}
