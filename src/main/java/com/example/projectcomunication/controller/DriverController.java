package com.example.projectcomunication.controller;

import com.example.projectcomunication.annotations.MyPageableDefault;
import com.example.projectcomunication.dto.DriverDto;
import com.example.projectcomunication.service.DriverService;
import com.example.projectcomunication.specification.DriverSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<DriverDto> findAll(DriverSpecification driverSpecification, @MyPageableDefault(size = 5) Pageable pageable) {
        return driverService.findAll(driverSpecification, pageable);
    }
}
