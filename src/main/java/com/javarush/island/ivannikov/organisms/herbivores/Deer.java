package com.javarush.island.ivannikov.organisms.herbivores;

import com.javarush.island.ivannikov.organisms.abstraction.Trobivore;

// Олень
public class Deer extends Trobivore {
    public Deer(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }

    @Override
    public Integer eating() {
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
