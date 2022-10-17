package com.javarush.island.ivannikov.organisms.abstraction;

public abstract class Predator extends Animal {
    protected Predator(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }
}
