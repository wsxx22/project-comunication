package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.LineDto;
import com.example.projectcomunication.entity.Line;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LineMapper {

    @Mapping(target = "transportTypeName", source = "transportType.name")
    LineDto toDto (Line line);

    List<LineDto> toDtoList (List<Line> lineList);



}
