package com.example.projectcomunication.service;

import com.example.projectcomunication.entity.Vehicle;
import com.example.projectcomunication.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> findAll () {
        return vehicleRepository.findAll();
    }

    public List<Vehicle> findVehiclesByTransportTypeId (Long id) {

        List<Vehicle> vehicles = vehicleRepository.findByTransportTypeId(id);

        return vehicles.size() > 0 ? vehicles : Collections.emptyList();
    }

}
