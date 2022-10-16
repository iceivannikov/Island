package com.javarush.island.ivannikov.organisms.abstractions;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public abstract class Organisms {
private final String name;
private final double maxWeight;
private final double maxCount;
private final double maxMove;
private final double maxEat;

    protected Organisms(String name, double maxWeight, double maxCount, double maxMove, double maxEat) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.maxCount = maxCount;
        this.maxMove = maxMove;
        this.maxEat = maxEat;
    }

    public String getName() {
        return name;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getMaxCount() {
        return maxCount;
    }

    public double getMaxMove() {
        return maxMove;
    }

    public double getMaxEat() {
        return maxEat;
    }

    public Set<Double> getValue() {
        Set<Double> value = new HashSet<>();
        value.add(maxWeight);
        value.add(maxCount);
        value.add(maxMove);
        value.add(maxEat);

        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organisms organisms = (Organisms) o;
        return Double.compare(organisms.maxWeight, maxWeight) == 0 && maxCount == organisms.maxCount && maxMove == organisms.maxMove && Double.compare(organisms.maxEat, maxEat) == 0 && Objects.equals(name, organisms.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxWeight, maxCount, maxMove, maxEat);
    }

    @Override
    public String toString() {
        return "Organisms{" +
                "name='" + name + '\'' +
                ", maxWeight=" + maxWeight +
                ", maxCount=" + maxCount +
                ", maxMove=" + maxMove +
                ", maxEat=" + maxEat +
                '}';
    }

}
