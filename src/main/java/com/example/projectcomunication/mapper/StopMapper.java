package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.StopDto;
import com.example.projectcomunication.entity.Stop;
import com.example.projectcomunication.exception.TransportTypeNotFound;
import com.example.projectcomunication.repository.TransportTypeRepository;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
@NoArgsConstructor
public abstract class StopMapper {

    @Autowired
    private TransportTypeRepository transportTypeRepository;

    @Mapping(target = "transportTypeId", source = "transportType.id")
    public abstract StopDto toDto (Stop stop);

    public abstract List<StopDto> toDtoList (List<Stop> stopList);

    public Stop dtoToEntity (StopDto stopDto) {

        return new Stop(
                stopDto.getName(),
                stopDto.getLatitude(),
                stopDto.getLongitude(),
                transportTypeRepository.findById(stopDto.getTransportTypeId()).orElseThrow(() -> new TransportTypeNotFound("Transport not found"))
        );

    }

}
