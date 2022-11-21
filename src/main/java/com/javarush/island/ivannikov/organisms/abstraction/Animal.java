package com.javarush.island.ivannikov.organisms.abstraction;

import java.util.Properties;

public abstract class Animal extends Organisms {
    protected Animal(Properties properties, String type) {
        super(properties,type);
    }
}
