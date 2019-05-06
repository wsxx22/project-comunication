package com.example.projectcomunication.service;

import com.example.projectcomunication.dto.DriverDto;
import com.example.projectcomunication.mapper.DriverMapper;
import com.example.projectcomunication.repository.DriverRepository;
import com.example.projectcomunication.specification.DriverSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    private DriverRepository driverRepository;
    private DriverMapper driverMapper;

    @Autowired
    public DriverService(DriverRepository driverRepository, DriverMapper driverMapper) {
        this.driverRepository = driverRepository;
        this.driverMapper = driverMapper;
    }

//    public List<DriverDto> findAll () {
//        return driverMapper.toDtoList(driverRepository.findAll());
//    }

    public List<DriverDto> findAll(DriverSpecification driverSpecification, Pageable pageable) {
        return driverMapper.toDtoList(driverRepository.findAll(driverSpecification, pageable).getContent());
    }

}
