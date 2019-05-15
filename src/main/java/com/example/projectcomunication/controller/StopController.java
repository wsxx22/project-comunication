package com.example.projectcomunication.controller;

import com.example.projectcomunication.dto.StopDto;
import com.example.projectcomunication.dto.StopLineDto;
import com.example.projectcomunication.entity.Stop;
import com.example.projectcomunication.entity.StopLine;
import com.example.projectcomunication.mapper.StopLineMapper;
import com.example.projectcomunication.mapper.StopMapper;
import com.example.projectcomunication.repository.StopLineRepository;
import com.example.projectcomunication.service.StopService;
import com.example.projectcomunication.specification.StopLineSpecification;
import com.example.projectcomunication.specification.StopSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/stops")
public class StopController {

    private StopService stopService;
    private StopMapper stopMapper;
    private StopLineMapper stopLineMapper;

    @Autowired
    private StopLineRepository stopLineRepository;

    @Autowired
    public StopController(StopService stopService, StopMapper stopMapper, StopLineMapper stopLineMapper) {
        this.stopService = stopService;
        this.stopMapper = stopMapper;
        this.stopLineMapper = stopLineMapper;
    }

    @PostMapping
    public StopDto addStop (@RequestBody StopDto stopDto) {
        return stopMapper.toDto(stopService.addStop(stopMapper.dtoToEntity(stopDto)));
    }

    @GetMapping
    public List<StopDto> findAll(StopSpecification stopSpecification, Pageable pageable) {
        return stopMapper.toDtoList(stopService.findAll(stopSpecification, pageable));
//
//        System.out.println(stopService.findById(2L).getStopLines().size());
//
//        return "";
    }

    @GetMapping("/{id}/lines")
    public List<StopLineDto> findStopLines(@PathVariable("id") Long id, StopLineSpecification stopLineSpecification) {
        return stopLineMapper.toDto(stopLineRepository.findAll(stopLineSpecification).stream().filter(s -> s.getStop().getId().equals(id)).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public StopDto findById(@PathVariable Long id) {
        return stopMapper.toDto(stopService.findById(id));
    }

}
