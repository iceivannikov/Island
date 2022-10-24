package com.javarush.island.ivannikov.organisms.herbivores;

import com.javarush.island.ivannikov.organisms.abstraction.Trobivore;

import java.util.Properties;

// Олень
public class Deer extends Trobivore {

    public Deer(Properties properties, String type) {
        super(properties, type);
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
