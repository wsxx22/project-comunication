package com.example.projectcomunication.controller;

import com.example.projectcomunication.annotations.MyPageableDefault;
import com.example.projectcomunication.dto.DriverDto;
import com.example.projectcomunication.entity.Driver;
import com.example.projectcomunication.mapper.DriverMapper;
import com.example.projectcomunication.service.DriverService;
import com.example.projectcomunication.specification.DriverSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private DriverService driverService;
    private DriverMapper driverMapper;

    @Autowired
    public DriverController(DriverService driverService, DriverMapper driverMapper) {
        this.driverService = driverService;
        this.driverMapper = driverMapper;
    }

    @GetMapping
    public List<DriverDto> findAll(DriverSpecification driverSpecification, @MyPageableDefault(size = 5) Pageable pageable) {
        return driverMapper.toDtoList(driverService.findAll(driverSpecification, pageable));
    }

    @PostMapping
    public DriverDto addDriver (@RequestBody Driver driver) {
        return driverMapper.toDto(driverService.addDriver(driver));
    }

    @PatchMapping("/update/{id}")
    public DriverDto updateDriver(@RequestBody Driver driver, @PathVariable Long id ) {
        return driverMapper.toDto(driverService.updateDriver(driver, id));
    }

}
