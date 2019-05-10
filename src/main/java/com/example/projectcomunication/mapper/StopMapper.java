package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.StopDto;
import com.example.projectcomunication.entity.Stop;
import com.example.projectcomunication.exception.TransportTypeNotFound;
import com.example.projectcomunication.repository.TransportTypeRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class StopMapper {

    @Autowired
    private TransportTypeRepository transportTypeRepository;

    @Mapping(target = "transportTypeName", source = "transportType.name")
    public abstract StopDto toDto (Stop stop);

    public abstract List<StopDto> toDtoList (List<Stop> stopList);

    public Stop dtoToEntity (StopDto stopDto) {

        return new Stop(
                stopDto.getName(),
                stopDto.getLatitude(),
                stopDto.getLongitude(),
                transportTypeRepository.findByName(stopDto.getTransportTypeName()).orElseThrow(() -> new TransportTypeNotFound("Transport not found"))
        );

    }


}
