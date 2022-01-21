package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {
    private final BeanA bean;

    // actually this annotation is not needed here as this bean has only one constructor
    @Autowired
    public OtherBeanA(BeanA beanA) {
        this.bean = beanA;
        System.out.println(this.getClass().getSimpleName() + ". " +
                bean.getClass().getSimpleName() +
                " was injected through the constructor");
    }
}
