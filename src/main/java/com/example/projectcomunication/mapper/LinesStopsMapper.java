package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.LinesStopsDto;
import com.example.projectcomunication.entity.LineStop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LineMapper.class, StopMapper.class}, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface LinesStopsMapper {

    @Mappings({
            @Mapping(target = "line", source = "line.name"),
            @Mapping(target = "endStop", source = "endStop.name"),
            @Mapping(target = "stop", source = "stop.name")
    })
    LinesStopsDto toDto (LineStop lineStop);

    List<LinesStopsDto> toDtoList (List<LineStop> linesStops);

}
