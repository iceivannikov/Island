package com.javarush.island.ivannikov;

import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.repository.OrganismType;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {

    private final Cell[][] cells = new Cell[10][10];


    public void initialize() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(i,j);

                OrganismType[] organismTypes = OrganismType.values();
                for (OrganismType organismType : organismTypes) {
                    //int countOrganisms = ThreadLocalRandom.current().nextInt(0, );
                }
            }
        }
    }

    public void start() {
        System.out.println("Simulation started");


    }

    public void showStatistics() {

    }
}

