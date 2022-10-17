package com.javarush.island.ivannikov.organisms.plants;

import com.javarush.island.ivannikov.organisms.abstraction.Plants;

//Трава
public class Grass extends Plants {

    public Grass(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }
}
