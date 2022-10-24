package com.javarush.island.ivannikov.organisms.abstraction;

import com.javarush.island.ivannikov.organisms.interfaces.Eating;
import com.javarush.island.ivannikov.organisms.interfaces.Movable;
import com.javarush.island.ivannikov.organisms.interfaces.Multiply;

import java.util.Properties;

public abstract class Animal extends Organisms implements Eating, Movable, Multiply {

    protected Animal(Properties properties, String type) {
        super(properties,type);
    }
}
