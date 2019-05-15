package com.example.projectcomunication.repository;

import com.example.projectcomunication.entity.Line;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LineRepository extends JpaRepository<Line, Long> {

    Optional<Line> findByName (String name);

}
