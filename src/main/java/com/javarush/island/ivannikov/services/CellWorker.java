package com.javarush.island.ivannikov.services;

import com.javarush.island.ivannikov.Cell;
import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.repository.OrganismType;

import java.util.Map;
import java.util.Set;

public class CellWorker {
    public synchronized void getStep(Cell cell) {
        Map<OrganismType, Set<Organisms>> organism = cell.getOrganism();
        for (Map.Entry<OrganismType, Set<Organisms>> entry : organism.entrySet()) {
            Set<Organisms> organisms = entry.getValue();
            for (Organisms organism1 : organisms) {
                organism1.eating();
                organism1.multiply();
                organism1.movable();
            }
        }
    }
}
