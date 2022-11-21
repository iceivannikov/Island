package com.javarush.island.ivannikov;

import com.javarush.island.ivannikov.services.GameFieldWorker;

public class Runner {
    public static void main(String[] args) {
        GameFieldWorker gameFieldWorker = new GameFieldWorker();
        Thread thread = new Thread(gameFieldWorker);
        thread.start();

    }
}