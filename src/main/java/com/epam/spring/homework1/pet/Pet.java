package com.epam.spring.homework1.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {
    private final List<Animal> animals;

    //@Autowired
    public Pet(List<Animal> animals) {
        this.animals = animals;
    }

    public void print() {
        animals.forEach(animal -> System.out.println(animal.getClass().getSimpleName()));
    }
}
