package com.example.projectcomunication.controller;

import com.example.projectcomunication.dto.StopDto;
import com.example.projectcomunication.service.StopService;
import com.example.projectcomunication.specification.StopSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stops")
public class StopController {

    private StopService stopService;

    @Autowired
    public StopController(StopService stopService) {
        this.stopService = stopService;
    }

    @PostMapping
    public StopDto addStop (@RequestBody StopDto stopDto) {
        return stopService.addStop(stopDto);
    }

    @GetMapping
    public List<StopDto> findAll(StopSpecification stopSpecification, Pageable pageable) {
        return stopService.findAll(stopSpecification, pageable);
    }

}
