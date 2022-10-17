package com.javarush.island.ivannikov.organisms.abstraction;

public abstract class Insects extends Organisms {
    protected Insects(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }
}
