package com.javarush.island.ivannikov.organisms.insects;


//Гусеница

import com.javarush.island.ivannikov.organisms.abstractions.Organisms;



public class Caterpillar extends Organisms {


    protected Caterpillar(String name, double maxWeight, int maxCount, int maxMove, double maxEat) {
        super(name, maxWeight, maxCount, maxMove, maxEat);
    }

}
