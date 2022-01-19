package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanC {
    @Autowired
    private BeanC bean;

    public OtherBeanC() {
        System.out.println(bean);
        // /\
        // |
        // is null `cause BeanC is injected after construction of OtherBeanC (that's my guess at least)
    }
}