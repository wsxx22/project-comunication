package com.example.projectcomunication.controller;

import com.example.projectcomunication.dto.VehicleDto;
import com.example.projectcomunication.entity.Vehicle;
import com.example.projectcomunication.mapper.VehicleMapper;
import com.example.projectcomunication.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private VehicleService vehicleService;
    private VehicleMapper vehicleMapper;

    @Autowired
    public VehicleController(VehicleService vehicleService, VehicleMapper vehicleMapper) {
        this.vehicleService = vehicleService;
        this.vehicleMapper = vehicleMapper;
    }

    @GetMapping
    public List<VehicleDto> findAll () {
        return vehicleMapper.toDtoList(vehicleService.findAll());
    }

    @GetMapping("/transport-type/{id}")
    public List<VehicleDto> findVehiclesByTransportTypeId (@PathVariable Long id) {
        return vehicleMapper.toDtoList(vehicleService.findVehiclesByTransportTypeId(id));
    }

}
