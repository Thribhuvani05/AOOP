package com.singletonPattern;

public class Logger {
	private Logger() {}
    private static Logger instance = null;
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[" + System.currentTimeMillis() + "] " + message);
    }
}


