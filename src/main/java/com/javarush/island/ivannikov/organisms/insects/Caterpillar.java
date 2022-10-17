package com.javarush.island.ivannikov.organisms.insects;

import com.javarush.island.ivannikov.organisms.abstraction.Insects;
//Гусеница
public class Caterpillar extends Insects {
    public Caterpillar(String name, Double weight, Integer maxCount, Double move, Double eat) {
        super(name, weight, maxCount, move, eat);
    }
}
