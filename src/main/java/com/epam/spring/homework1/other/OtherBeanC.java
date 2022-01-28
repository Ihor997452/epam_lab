package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OtherBeanC {
    @Autowired
    private BeanC bean;

    public OtherBeanC() {
        System.out.println(bean);
        // /\
        //  |
        // is null `cause BeanC is injected after construction of OtherBeanC (that's my guess at least)
    }

    //@PostConstruct
    //public void init() {
    //    System.out.println(bean); // <- not null
    //}
}
