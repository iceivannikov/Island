package com.javarush.island.ivannikov.repository;

import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.organisms.herbivores.*;
import com.javarush.island.ivannikov.organisms.insects.Caterpillar;
import com.javarush.island.ivannikov.organisms.plants.Grass;
import com.javarush.island.ivannikov.organisms.predators.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class AnimalFactory {
    private final ArrayList<Organisms> organismsList = new ArrayList<>();

    public List<Organisms> createOrganisms(Properties properties) {
        ArrayList<OrganismType> organismTypes = new ArrayList<>(Arrays.asList(OrganismType.values()));
        for (OrganismType organismType : organismTypes) {
            String type = organismType.name().toLowerCase();
            int maxSize = Integer.parseInt(properties.getProperty(type + ".maxSize"));
            for (int i = 0; i < maxSize; i++) {
                Organisms organisms = createOrganism(properties, type);
                organisms.setName(type + " - " + i);
                organismsList.add(organisms);
            }
        }
        return organismsList;
    }

    private Organisms createOrganism(Properties properties, String type) {

        return switch (type) {
            case "wolf" -> new Wolf(properties, type);
            case "fox" -> new Fox(properties, type);
            case "eagle" -> new Eagle(properties, type);
            case "boa" -> new Boa(properties, type);
            case "bear" -> new Bear(properties, type);
            case "horse" -> new Horse(properties, type);
            case "sheep" -> new Sheep(properties, type);
            case "rabbit" -> new Rabbit(properties, type);
            case "mouse" -> new Mouse(properties, type);
            case "goat" -> new Goat(properties, type);
            case "duck" -> new Duck(properties, type);
            case "deer" -> new Deer(properties, type);
            case "buffalo" -> new Buffalo(properties, type);
            case "boar" -> new Boar(properties, type);
            case "caterpillar" -> new Caterpillar(properties, type);
            default -> new Grass(properties, type);
        };
    }
}


