package org.depaul.se350.abstractfactory.aircraft;

public class LightTransportCraft implements Aircraft {
    @Override
    public void start() {
        System.out.println("Starting Light Transport Aircraft");
    }

    @Override
    public void fly() {
        System.out.println("Flying Light Transport Aircraft");
    }

    @Override
    public String toString() {
        return "LightTransportCraft{}";
    }
}
