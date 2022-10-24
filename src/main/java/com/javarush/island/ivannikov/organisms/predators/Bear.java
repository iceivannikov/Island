package com.javarush.island.ivannikov.organisms.predators;

import com.javarush.island.ivannikov.organisms.abstraction.Predator;

import java.util.Properties;

public class Bear extends Predator {

    public Bear(Properties properties, String type) {
        super(properties, type);
    }

//    @Override
//    public Integer eating() {
//        return 0;
//    }
//
//    @Override
//    public Integer movable() {
//        return 0;
//    }
//
//    @Override
//    public Boolean multiply() {
//        return true;
//    }
}
