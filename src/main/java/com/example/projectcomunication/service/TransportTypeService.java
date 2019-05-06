package com.example.projectcomunication.service;

import com.example.projectcomunication.dto.TransportTypeDto;
import com.example.projectcomunication.entity.TransportType;
import com.example.projectcomunication.exception.TransportTypeNotFound;
import com.example.projectcomunication.mapper.TransportTypeMapper;
import com.example.projectcomunication.repository.TransportTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportTypeService {

    private TransportTypeRepository transportTypeRepository;
    private TransportTypeMapper transportTypeMapper;

    @Autowired
    public TransportTypeService(TransportTypeRepository transportTypeRepository, TransportTypeMapper transportTypeMapper) {
        this.transportTypeRepository = transportTypeRepository;
        this.transportTypeMapper = transportTypeMapper;
    }

    public List<TransportTypeDto> findAll() {
        return transportTypeMapper.toDtoList(transportTypeRepository.findAll());
    }

    public TransportTypeDto findById (Long id) {
        return transportTypeMapper.toDto(transportTypeRepository.findById(id).orElseThrow(() -> new TransportTypeNotFound("nie ma")));
    }

}
