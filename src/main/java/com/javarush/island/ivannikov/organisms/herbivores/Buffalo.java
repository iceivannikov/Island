package com.javarush.island.ivannikov.organisms.herbivores;

import com.javarush.island.ivannikov.organisms.abstraction.Trobivore;

import java.util.Properties;

public class Buffalo extends Trobivore {
    public Buffalo(Properties properties, String type) {
        super(properties, type);
    }


    @Override
    public Integer eating() {
        return 0;
    }

    @Override
    public Integer movable() {
        return 0;
    }

    @Override
    public Boolean multiply() {
        return true;
    }
}
