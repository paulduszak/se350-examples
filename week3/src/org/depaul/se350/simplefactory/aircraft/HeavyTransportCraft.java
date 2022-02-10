package org.depaul.se350.simplefactory.aircraft;

public class HeavyTransportCraft implements Aircraft {

    public void start() {
        System.out.println("Starting Heavy Transport Aircraft");
    }

    public void fly() {
        System.out.println("Flying Heavy Transport Aircraft");
    }

    public String toString() {
        return "HeavyTransportCraft{}";
    }
}
