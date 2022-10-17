package com.javarush.island.ivannikov.organisms.abstraction;

import com.javarush.island.ivannikov.organisms.interfaces.Eating;
import com.javarush.island.ivannikov.organisms.interfaces.Movable;
import com.javarush.island.ivannikov.organisms.interfaces.Multiply;

public abstract class Animal extends Organisms implements Eating, Movable, Multiply {
    protected Animal(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }
}
