package com.javarush.island.ivannikov.organisms.predators;

import com.javarush.island.ivannikov.organisms.abstraction.Predator;

public class Boa extends Predator {
    public Boa(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }

    @Override
    public Integer eating() {
        return 0;
    }

    @Override
    public Integer movable() {
        return 0;
    }

    @Override
    public Boolean multiply() {
        return true;
    }
}
