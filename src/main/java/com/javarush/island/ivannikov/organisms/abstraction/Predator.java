package com.javarush.island.ivannikov.organisms.abstraction;

import java.util.Properties;

public class Predator extends Animal {


    protected Predator(Properties properties, String type) {
        super(properties, type);
    }

    @Override
    public void eating() {
        System.out.println("Животное поело");
    }

    @Override
    public void movable() {
        System.out.println("Животное сдалало шаг");
    }

    @Override
    public void multiply() {
        System.out.println("Животное размножилось");
    }
}
