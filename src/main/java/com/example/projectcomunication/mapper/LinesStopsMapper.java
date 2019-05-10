package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.LinesStopsDto;
import com.example.projectcomunication.entity.LinesStops;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LineMapper.class, StopMapper.class}, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface LinesStopsMapper {


    LinesStopsDto toDto (LinesStops linesStops);

    List<LinesStopsDto> toDtoList (List<LinesStops> linesStops);

}
