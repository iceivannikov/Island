package com.javarush.island.ivannikov.organisms.abstraction;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
public abstract class Organisms {
    private final String name;
    private final Double weight;
    private final Integer maxCount;
    private final Double move;
    private final Double eat;
}
