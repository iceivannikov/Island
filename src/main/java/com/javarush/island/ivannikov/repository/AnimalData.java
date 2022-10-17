package com.javarush.island.ivannikov.repository;


import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.organisms.herbivores.Horse;
import com.javarush.island.ivannikov.organisms.predators.Fox;
import com.javarush.island.ivannikov.organisms.predators.Wolf;

import java.util.List;

public class AnimalData {
    private final List<Organisms> newOrganisms;

    public AnimalData(List<Organisms> newOrganisms) {
        this.newOrganisms = newOrganisms;
    }


//    public List<? extends Organisms> createAnimals(){
//
//        newOrganisms.add(new Wolf("Wolf", 50,30,3,8));
//        newOrganisms.add(new Fox("Fox", 8,30,2,2));
//        newOrganisms.add(new Horse("Horse", 400, 20, 4,60));
//
//        return newOrganisms;
//    }

//    public Organisms getAnimal(Organisms organisms) {
//
//        for (Organisms organism : newOrganisms) {
//            if (organism.equals(organisms)) {
//
//            }
//        }
//
//        return organism;
//    }

}
