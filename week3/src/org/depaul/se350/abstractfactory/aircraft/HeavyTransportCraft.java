package org.depaul.se350.abstractfactory.aircraft;

public class HeavyTransportCraft implements Aircraft {
    @Override
    public void start() {
        System.out.println("Starting Heavy Transport Aircraft");
    }

    @Override
    public void fly() {
        System.out.println("Flying Heavy Transport Aircraft");
    }

    @Override
    public String toString() {
        return "HeavyTransportCraft{}";
    }
}
