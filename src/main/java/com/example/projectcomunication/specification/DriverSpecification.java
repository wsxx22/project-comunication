package com.example.projectcomunication.specification;

import com.example.projectcomunication.entity.Driver;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "name", params = "nameOf", spec = LikeIgnoreCase.class)
})
public interface DriverSpecification extends Specification<Driver> {
}
