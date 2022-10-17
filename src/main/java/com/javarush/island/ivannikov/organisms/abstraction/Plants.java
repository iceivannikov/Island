package com.javarush.island.ivannikov.organisms.abstraction;

public abstract class Plants extends Organisms {
    protected Plants(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }
}
