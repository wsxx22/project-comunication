package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.LineDto;
import com.example.projectcomunication.entity.Line;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LineMapper {

    @Mapping(target = "transportTypeId", source = "transportType.id")
    LineDto toDto (Line line);



}
