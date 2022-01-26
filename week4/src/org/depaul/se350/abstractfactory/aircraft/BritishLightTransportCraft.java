package org.depaul.se350.abstractfactory.aircraft;

public class BritishLightTransportCraft implements Aircraft {
    @Override
    public void start() {
        System.out.println("Starting British Light Transport Aircraft");
    }

    @Override
    public void fly() {
        System.out.println("Flying British Light Transport Aircraft");
    }

    @Override
    public String toString() {
        return "British LightTransportCraft{}";
    }
}
