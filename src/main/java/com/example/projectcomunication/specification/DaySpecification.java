package com.example.projectcomunication.specification;

import com.example.projectcomunication.entity.Day;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "day", params = "dayOf", spec = Like.class)
})
public interface DaySpecification extends Specification<Day> {
}
