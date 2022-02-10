package org.depaul.se350.singleton;


public class Main {

    public static void main(String[] args) throws Exception {
       // Singleton.getInstance().printHello();
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

        Singleton singleton = Singleton.getInstance();

        singleton.printHello();

    }
}
