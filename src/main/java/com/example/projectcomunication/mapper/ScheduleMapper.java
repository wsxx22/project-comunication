package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.ScheduleDto;
import com.example.projectcomunication.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueMappingStrategy;

@Mapper(componentModel = "spring", uses = StopMapper.class, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface ScheduleMapper {

    @Mappings({
            @Mapping(target = "startStopId", source = "startStop.id"),
            @Mapping(target = "endStopId", source = "endsStop.id"),
            @Mapping(target = "lineId", source = "line.id"),
            @Mapping(target = "vehicleId", source = "vehicle.id"),
            @Mapping(target = "driverId", source = "driver.id")
    })
    ScheduleDto toDto (Schedule schedule);

}
