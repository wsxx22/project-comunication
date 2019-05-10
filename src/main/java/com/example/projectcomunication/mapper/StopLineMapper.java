package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.StopLineDto;
import com.example.projectcomunication.entity.StopLine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StopLineMapper {

    @Mappings({
            @Mapping(target = "stop", source = "stop.name"),
            @Mapping(target = "line", source = "line.name"),
            @Mapping(target = "day", source = "day.day"),
    })
    StopLineDto toDto (StopLine stopLine);

    List<StopLineDto> toDto (List<StopLine> stopLines);
}
