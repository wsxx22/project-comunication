package com.example.projectcomunication.controller;

import com.example.projectcomunication.dto.LineDto;
import com.example.projectcomunication.mapper.LineMapper;
import com.example.projectcomunication.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lines")
public class LineController {

    private LineService lineService;
    private LineMapper lineMapper;

    @Autowired
    public LineController(LineService lineService, LineMapper lineMapper) {
        this.lineService = lineService;
        this.lineMapper = lineMapper;
    }

    @GetMapping
    public List<LineDto> findAll() {
        return lineMapper.toDtoList(lineService.findAll());
    }

    @GetMapping("/{id}")
    public LineDto findById (@PathVariable Long id) {
        return lineMapper.toDto(lineService.findById(id));
    }

}
