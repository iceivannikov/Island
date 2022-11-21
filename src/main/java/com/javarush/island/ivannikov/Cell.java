package com.javarush.island.ivannikov;

import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.repository.AnimalFactory;
import com.javarush.island.ivannikov.repository.OrganismType;

import java.util.*;

public class Cell {
    private final Map<OrganismType, Set<Organisms>> organism;
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        AnimalFactory animalFactory = new AnimalFactory();
        this.organism = animalFactory.createOrganisms(Settings.load());
    }

    public Map<OrganismType, Set<Organisms>> getOrganism() {
        return organism;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "Cell[" +
                "row=" + row +
                ", col=" + col + "] : ";
    }
}






