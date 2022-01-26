package org.depaul.se350.singleton;

public final class Singleton {

    private static Singleton ourInstance;

    public static Singleton getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new Singleton();

        return ourInstance;
    }

    private Singleton() {
    }

    public void printHello() {
        System.out.println("Hello");
    }
}