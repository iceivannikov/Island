package com.javarush.island.ivannikov;

import com.javarush.island.ivannikov.organisms.abstractions.Organisms;
import com.javarush.island.ivannikov.repository.AnimalData;

import java.util.List;

public class Cell {

    AnimalData animalData;
    private final int row;
    private final int col;


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    private List<Organisms> cell;

    public List<Organisms> getCell() {
        return cell;
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;

    }

    public void cellFill(List<Organisms> cell) {
        cell.add((Organisms) animalData.createAnimals());
    }

    public void getCellData() {
        for (Organisms organisms : cell) {
            System.out.println(organisms.toString());
        }
    }

}






