package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.VehicleDto;
import com.example.projectcomunication.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    @Mapping(target = "transportTypeName", source = "transportType.name")
    VehicleDto toDto (Vehicle vehicle);

    List<VehicleDto> toDtoList (List<Vehicle> vehicles);
}
