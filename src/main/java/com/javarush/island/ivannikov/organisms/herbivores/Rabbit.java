package com.javarush.island.ivannikov.organisms.herbivores;

import com.javarush.island.ivannikov.organisms.abstraction.Trobivore;

public class Rabbit extends Trobivore {
    public Rabbit(String name, Double weight, Integer maxCount, Double move, Double eat) {
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
