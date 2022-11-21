package com.javarush.island.ivannikov.organisms.abstraction;

import java.util.Properties;

public abstract class Plants extends Organisms {
    protected Plants(Properties properties, String type){
        super(properties,type);
    }

}
