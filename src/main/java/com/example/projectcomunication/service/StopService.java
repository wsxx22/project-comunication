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


    @Autowired
    public StopService(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    public List<Stop> findAll(StopSpecification stopSpecification, Pageable pageable) {
        return stopRepository.findAll(stopSpecification, pageable).getContent();
    }

    public Stop addStop (Stop stop) {
        return stopRepository.save(stop);
    }

    public Stop findById (Long id) {
        return stopRepository.findById(id).orElseThrow(() -> new StopNotExists());
    }

}
