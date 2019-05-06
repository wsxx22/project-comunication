package com.example.projectcomunication.config;

import com.example.projectcomunication.annotations.MyPageableDefault;
import org.springframework.core.MethodParameter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Optional;

public class MyPageableDefaultConfig extends PageableHandlerMethodArgumentResolver {

    @Override
    public Pageable resolveArgument(MethodParameter methodParameter, ModelAndViewContainer mavContainer,
                                    NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {

        Pageable pageable = super.resolveArgument(methodParameter, mavContainer, webRequest, binderFactory);

        Optional<MyPageableDefault> optionalMyPageableDefault = Optional.ofNullable(
                methodParameter.getParameterAnnotation(MyPageableDefault.class));


            if (optionalMyPageableDefault.isPresent()) {
//                MyPageableDefault myPageableDefault = optionalMyPageableDefault.get();

                int size = optionalMyPageableDefault.get().size() == 10 ?
                                                        optionalMyPageableDefault.get().size() : pageable.getPageSize();

                    if (size > optionalMyPageableDefault.get().maxSize())
                        size = optionalMyPageableDefault.get().maxSize();
                    else if (size < optionalMyPageableDefault.get().minSize())
                        size = optionalMyPageableDefault.get().minSize();

                pageable = PageRequest.of(pageable.getPageNumber(), size, pageable.getSort());
            }
        return pageable;
    }

}
