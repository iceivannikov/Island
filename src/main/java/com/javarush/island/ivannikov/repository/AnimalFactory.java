package com.javarush.island.ivannikov.repository;

import com.javarush.island.ivannikov.Random;
import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.organisms.herbivores.*;
import com.javarush.island.ivannikov.organisms.insects.Caterpillar;
import com.javarush.island.ivannikov.organisms.plants.Grass;
import com.javarush.island.ivannikov.organisms.predators.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AnimalFactory {
    public static final String MAX_SIZE = ".maxSize";
    private final Map<OrganismType, Set<Organisms>> organismTypeSetMap = new ConcurrentHashMap<>();

    public Map<OrganismType, Set<Organisms>> createOrganisms(Properties properties) {
        Set<Organisms> organismsSet = new HashSet<>();
        Set<OrganismType> organismTypes = new HashSet<>(Arrays.asList(OrganismType.values()));
        for (OrganismType organismType : organismTypes) {
            String type = organismType.name().toLowerCase();
            String countOrganisms = properties.getProperty(type + MAX_SIZE);
            double bound = Double.parseDouble(countOrganisms);
            double maxCountOrganismInOneCell = Random.random(0,bound);
            for (int i = 0; i < maxCountOrganismInOneCell; i++) {
                Organisms organisms = createOrganism(properties, type);
                String name = type + " " + i;
                organisms.setName(name);
                organismsSet.add(organisms);
                organismTypeSetMap.put(OrganismType.valueOf(type.toUpperCase()), organismsSet);
            }
        }
        return organismTypeSetMap;
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


