package com.example.projectcomunication.controller;

import com.example.projectcomunication.dto.LineDto;
import com.example.projectcomunication.dto.LinesStopsDto;
import com.example.projectcomunication.entity.LineStop;
import com.example.projectcomunication.entity.StopLine;
import com.example.projectcomunication.mapper.LineMapper;
import com.example.projectcomunication.mapper.LinesStopsMapper;
import com.example.projectcomunication.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lines")
public class LineController {

    private LineService lineService;
    private LineMapper lineMapper;
    private LinesStopsMapper linesStopsMapper;

    @Autowired
    public LineController(LineService lineService, LineMapper lineMapper, LinesStopsMapper linesStopsMapper) {
        this.lineService = lineService;
        this.lineMapper = lineMapper;
        this.linesStopsMapper = linesStopsMapper;
    }

    @GetMapping
    public List<LineDto> findAll() {
        return lineMapper.toDtoList(lineService.findAll());
    }

    @GetMapping("/{name}")
    public LineDto findByName (@PathVariable String name) {
        return lineMapper.toDto(lineService.findByName(name));
    }

    @GetMapping("/{name}/stops")
    public List<LinesStopsDto> findAllLineStopsByLineName (@PathVariable String name) {
        return linesStopsMapper.toDtoList(lineService.findByName(name).getLinesStops());
                //.stream().sorted(Comparator.comparingInt(LinesStopsDto::getPosition)).collect(Collectors.toList());
    }

}
