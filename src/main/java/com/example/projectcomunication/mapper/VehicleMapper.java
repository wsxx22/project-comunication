package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.VehicleDto;
import com.example.projectcomunication.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    @Mapping(target = "transportTypeId", source = "transportType.id")
    VehicleDto toDto (Vehicle vehicle);

}
