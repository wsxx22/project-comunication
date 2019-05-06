package com.example.projectcomunication.repository;

import com.example.projectcomunication.entity.TransportType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportTypeRepository extends JpaRepository<TransportType, Long> {
}
