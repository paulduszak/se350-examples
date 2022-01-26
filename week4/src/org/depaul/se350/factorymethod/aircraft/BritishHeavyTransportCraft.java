package org.depaul.se350.factorymethod.aircraft;

public class BritishHeavyTransportCraft implements Aircraft {
    @Override
    public void start() {
        System.out.println("Starting British Heavy Transport Aircraft");
    }

    @Override
    public void fly() {
        System.out.println("Flying British Heavy Transport Aircraft");
    }

    @Override
    public String toString() {
        return "British HeavyTransportCraft{}";
    }
}
