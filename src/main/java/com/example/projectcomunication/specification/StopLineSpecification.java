package com.example.projectcomunication.specification;

import com.example.projectcomunication.entity.StopLine;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "line", params = "line", spec = Like.class)
})
public interface StopLineSpecification extends Specification<StopLine> {
}
