package com.javarush.island.ivannikov.organisms.abstraction;

import java.util.Properties;

public class Predator extends Animal {

    protected Predator(Properties properties, String type) {
        super(properties,type);
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
