package com.example.projectcomunication.service;

import com.example.projectcomunication.dto.StopDto;
import com.example.projectcomunication.entity.Stop;
import com.example.projectcomunication.exception.StopNotExists;
import com.example.projectcomunication.mapper.StopMapper;
import com.example.projectcomunication.repository.StopRepository;
import com.example.projectcomunication.specification.StopSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopService {

    private StopRepository stopRepository;
    private StopMapper stopMapper;

    @Autowired
    public StopService(StopRepository stopRepository, StopMapper stopMapper) {
        this.stopRepository = stopRepository;
        this.stopMapper = stopMapper;
    }

    public List<StopDto> findAll(StopSpecification stopSpecification, Pageable pageable) {
        return stopMapper.toDtoList(stopRepository.findAll(stopSpecification, pageable).getContent());
    }

    public StopDto addStop (StopDto stopDto) {

        Stop stop = stopMapper.dtoToEntity(stopDto).orElseThrow(() -> new StopNotExists());
        stopRepository.save(stop);
        return stopMapper.toDto(stop);
    }

}
