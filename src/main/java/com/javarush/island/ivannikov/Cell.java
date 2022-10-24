package com.javarush.island.ivannikov;

import com.javarush.island.ivannikov.organisms.abstraction.Organisms;
import com.javarush.island.ivannikov.repository.AnimalFactory;

import java.util.*;

public class Cell {
    AnimalFactory animalFactory;
    int row;
    int col;
    List<Organisms> organismsList;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


    public List<Organisms> addOrganisms() {
        Properties properties = Settings.load();
        organismsList = animalFactory.createOrganisms(properties);
        return organismsList;
    }
}






