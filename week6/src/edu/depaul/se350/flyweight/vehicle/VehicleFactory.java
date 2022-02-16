package edu.depaul.se350.flyweight.vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<String, Vehicle> vehicleCache = new HashMap<>();

    private VehicleFactory() {}

    public static Vehicle getVehicle(String color) {
        return vehicleCache.computeIfAbsent(color, newColor -> {
            return new Truck(color);
        });
    }
}
