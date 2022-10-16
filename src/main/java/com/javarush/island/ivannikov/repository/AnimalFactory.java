package com.javarush.island.ivannikov.repository;

import com.javarush.island.ivannikov.organisms.abstractions.Organisms;
import com.javarush.island.ivannikov.organisms.animals.herbivores.Deer;
import com.javarush.island.ivannikov.organisms.animals.herbivores.Horse;
import com.javarush.island.ivannikov.organisms.animals.predators.Fox;
import com.javarush.island.ivannikov.organisms.animals.predators.Wolf;
import com.javarush.island.ivannikov.organisms.insects.Caterpillar;
import com.javarush.island.ivannikov.organisms.plants.Grass;

public class AnimalFactory {
    private static final Class<?>[] TYPES = {Wolf.class, Fox.class, Horse.class, Deer.class, Caterpillar.class, Grass.class};
    private static final Organisms[] prototypes = AnimalFactoryData.createPrototypes(TYPES);


}
