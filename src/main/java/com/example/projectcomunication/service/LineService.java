package com.example.projectcomunication.service;

import com.example.projectcomunication.entity.Line;
import com.example.projectcomunication.entity.LinesStops;
import com.example.projectcomunication.exception.LineNotFound;
import com.example.projectcomunication.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineService {

    private LineRepository lineRepository;

    @Autowired
    public LineService(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }

    public List<Line> findAll () {
        return lineRepository.findAll();
    }

    public Line findById (Long id) {
        return lineRepository.findById(id).orElseThrow(() -> new LineNotFound("line not found"));
    }

}
