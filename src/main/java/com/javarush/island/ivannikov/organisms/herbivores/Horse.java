package com.javarush.island.ivannikov.organisms.herbivores;

import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.organisms.abstraction.Trobivore;


public class Horse extends Trobivore{

    public Horse(String name, Double weight, Integer maxCount, Double move, Double eat) {
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
