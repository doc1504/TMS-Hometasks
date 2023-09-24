package org.example;

public class MySingleton {

    private static MySingleton instance;

    public MySingleton() {
        System.out.println("Singleton created");
    }
    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
