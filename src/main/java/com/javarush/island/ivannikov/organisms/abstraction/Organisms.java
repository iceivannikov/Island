package com.javarush.island.ivannikov.organisms.abstraction;

import com.javarush.island.ivannikov.organisms.interfaces.Eating;
import com.javarush.island.ivannikov.organisms.interfaces.Movable;
import com.javarush.island.ivannikov.organisms.interfaces.Multiply;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Properties;

@Data
@RequiredArgsConstructor
public abstract class Organisms implements Eating, Movable, Multiply {
    private String name;
    private Double weight;
    private Double move;
    private Double eat;

    protected Organisms(Properties properties, String type) {
        this.name = properties.getProperty(type);
        this.weight = Double.parseDouble(properties.getProperty(type + ".weight"));
        this.move = Double.parseDouble(properties.getProperty(type + ".speed"));
        this.eat = Double.parseDouble(properties.getProperty(type + ".eat"));
    }

    @Override
    public String toString() {
        return "name= " + name;
    }
}
