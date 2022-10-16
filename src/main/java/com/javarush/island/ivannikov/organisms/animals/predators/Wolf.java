package com.javarush.island.ivannikov.organisms.animals.predators;

import com.javarush.island.ivannikov.organisms.abstractions.Organisms;
import com.javarush.island.ivannikov.organisms.annotation.AnimalData;


public class Wolf extends Organisms {

    public Wolf(String name, double maxWeight, int maxCount, int maxMove, double maxEat) {
        super(name, maxWeight, maxCount, maxMove, maxEat);
    }

}
