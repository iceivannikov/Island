package com.javarush.island.ivannikov.services;

import com.javarush.island.ivannikov.Cell;
import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.repository.AnimalData;
import com.javarush.island.ivannikov.repository.AnimalFactoryData;
import com.javarush.island.ivannikov.repository.OrganismType;

import java.util.Map;
import java.util.Set;

public class GameFieldWorker implements Runnable {
    private final AnimalData animalData = new AnimalData();
    private final Cell[][] cells = new Cell[3][3];


    @Override
    public void run() {
        System.out.println("Simulation started");
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                Cell cell = new Cell(i, j);
                cells[i][j] = cell;
                System.out.println(cells[i][j].toString());
                Map<OrganismType, Set<Organisms>> organism = cells[i][j].getOrganism();
                System.out.println(organism);
                //cellWorker.getStep(cells[i][j]);
            }
        }
    }
}
