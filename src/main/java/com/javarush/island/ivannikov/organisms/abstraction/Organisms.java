package com.javarush.island.ivannikov.organisms.abstraction;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Properties;

@Data
@RequiredArgsConstructor
public abstract class Organisms {
    private String name;
    private Double weight;
    private Double move;
    private Double eat;

    protected Organisms(Properties properties, String type) {
        this.weight = Double.parseDouble(properties.getProperty(type + ".weight"));
        this.move = Double.parseDouble(properties.getProperty(type + ".speed"));
        this.eat = Double.parseDouble(properties.getProperty(type + ".eat"));
    }
}
