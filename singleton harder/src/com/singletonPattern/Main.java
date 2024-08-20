package com.singletonPattern;

public class Main {
	public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");
        Thread thread1 = new Thread(() -> {
            Logger logger1 = Logger.getInstance();
            logger1.log("Thread 1: Doing some work");
        });

        Thread thread2 = new Thread(() -> {
            Logger logger2 = Logger.getInstance();
            logger2.log("Thread 2: Doing some other work");
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.log("Application finished");
    }
}
