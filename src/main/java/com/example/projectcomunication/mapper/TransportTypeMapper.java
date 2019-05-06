package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.TransportTypeDto;
import com.example.projectcomunication.entity.TransportType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransportTypeMapper {

    TransportTypeDto toDto (TransportType transportType);

    List<TransportTypeDto> toDtoList (List<TransportType> transportTypes);

}
