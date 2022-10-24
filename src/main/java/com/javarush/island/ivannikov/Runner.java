package com.javarush.island.ivannikov;

public class Runner {
    public static void main(String[] args) {
//        Properties properties = Settings.load();
//        AnimalFactory animalFactory = new AnimalFactory();
//        List<Organisms> organisms = animalFactory.createOrganisms(properties);
//        System.out.println(organisms);
        GameField gameField = new GameField();
        gameField.initialize();
    }
}