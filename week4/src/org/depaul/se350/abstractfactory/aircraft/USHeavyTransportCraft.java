package org.depaul.se350.abstractfactory.aircraft;

public class USHeavyTransportCraft implements Aircraft {
    @Override
    public void start() {
        System.out.println("Starting US Heavy Transport Aircraft");
    }

    @Override
    public void fly() {
        System.out.println("Flying US Heavy Transport Aircraft");
    }

    @Override
    public String toString() {
        return "US HeavyTransportCraft{}";
    }
}
