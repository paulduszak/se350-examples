package org.depaul.se350.factorymethod.aircraft;

public class USLightTransportCraft implements Aircraft {
    @Override
    public void start() {
        System.out.println("Starting US Light Transport Aircraft");
    }

    @Override
    public void fly() {
        System.out.println("Flying US Light Transport Aircraft");
    }

    @Override
    public String toString() {
        return "US LightTransportCraft{}";
    }
}
