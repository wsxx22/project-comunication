package com.example.projectcomunication.repository;

import com.example.projectcomunication.entity.StopLine;
import com.example.projectcomunication.entity.StopLineId;
import com.example.projectcomunication.specification.StopLineSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StopLineRepository extends JpaRepository<StopLine, StopLineId>, JpaSpecificationExecutor<StopLine> {

    //List<StopLine> findAllByStop_Id(Long id, StopLineSpecification stopLineSpecification);

}
