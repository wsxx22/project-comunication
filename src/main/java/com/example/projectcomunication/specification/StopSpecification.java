package com.example.projectcomunication.specification;

import com.example.projectcomunication.entity.Stop;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
    @Spec(path = "transportType.name", params = "transportType", spec = LikeIgnoreCase.class)
})
public interface StopSpecification extends Specification<Stop> {

}
