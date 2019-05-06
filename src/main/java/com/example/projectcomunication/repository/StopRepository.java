package com.example.projectcomunication.repository;

import com.example.projectcomunication.entity.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StopRepository extends JpaRepository<Stop, Long>, JpaSpecificationExecutor<Stop> {
}
