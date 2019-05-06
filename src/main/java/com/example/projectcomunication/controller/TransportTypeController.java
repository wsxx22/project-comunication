package com.example.projectcomunication.controller;

import com.example.projectcomunication.dto.TransportTypeDto;
import com.example.projectcomunication.service.TransportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TransportTypeController {

    private TransportTypeService transportTypeService;

    @Autowired
    public TransportTypeController(TransportTypeService transportTypeService) {
        this.transportTypeService = transportTypeService;
    }

    @GetMapping
    public List<TransportTypeDto> findAll() {
        return transportTypeService.findAll();
    }

    @GetMapping("/{id}")
    public TransportTypeDto findById (@PathVariable Long id) {
        return transportTypeService.findById(id);
    }

}
