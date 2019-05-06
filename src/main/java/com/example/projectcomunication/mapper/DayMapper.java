package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.DayDto;
import com.example.projectcomunication.entity.Day;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DayMapper {

    DayDto toDto (Day day);

    List<DayDto> toDtoList(List<Day> days);
}
