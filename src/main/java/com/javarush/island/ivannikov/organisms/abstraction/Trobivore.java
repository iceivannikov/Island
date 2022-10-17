package com.javarush.island.ivannikov.organisms.abstraction;

public abstract class Trobivore extends Animal {
    protected Trobivore(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }
}
