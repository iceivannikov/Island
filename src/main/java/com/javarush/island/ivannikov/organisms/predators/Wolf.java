package com.javarush.island.ivannikov.organisms.predators;

import com.javarush.island.ivannikov.organisms.abstraction.Animal;
import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.organisms.abstraction.Predator;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Wolf extends Predator {
    public Wolf(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }

    @Override
    public Integer eating() {
        System.out.println("Волк " + getName() + "съел");
        return null;
    }

    @Override
    public Integer movable() {
        return null;
    }

    @Override
    public Boolean multiply() {
        return null;
    }
}
