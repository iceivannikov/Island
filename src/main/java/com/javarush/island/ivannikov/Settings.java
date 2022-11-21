package com.javarush.island.ivannikov;

import com.javarush.island.ivannikov.exceptions.IslandException;
import com.javarush.island.ivannikov.repository.AnimalFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Settings {
    public static final String PROPERTIES_PATH = "C:\\Users\\Виктор\\IdeaProjects\\Island\\src\\main\\resources\\application.properties";

    private Settings() {
    }

    public static Properties load() {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader(PROPERTIES_PATH));
            new AnimalFactory().createOrganisms(properties);

            return properties;
        } catch (IOException e) {
            throw new IslandException("Файл не обнаружен ");
        }
    }
}
