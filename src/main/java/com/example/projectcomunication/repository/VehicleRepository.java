package com.example.projectcomunication.repository;

import com.example.projectcomunication.entity.TransportType;
import com.example.projectcomunication.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByTransportTypeId (Long id);

}
