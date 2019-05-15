package com.example.projectcomunication.controller;

import com.example.projectcomunication.dto.ScheduleDto;
import com.example.projectcomunication.mapper.ScheduleMapper;
import com.example.projectcomunication.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    private ScheduleService scheduleService;
    private ScheduleMapper scheduleMapper;

    @Autowired
    public ScheduleController(ScheduleService scheduleService, ScheduleMapper scheduleMapper) {
        this.scheduleService = scheduleService;
        this.scheduleMapper = scheduleMapper;
    }

    @GetMapping
    public List<ScheduleDto> findAll () {
        return scheduleMapper.toDtoList(scheduleService.findAll());
    }

    @GetMapping("/{id}")
    public ScheduleDto findById (@PathVariable Long id) {
        return scheduleMapper.toDto(scheduleService.findById(id));
    }

}
