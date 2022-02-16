package edu.depaul.se350.flyweight;

import edu.depaul.se350.flyweight.vehicle.Vehicle;
import edu.depaul.se350.flyweight.vehicle.VehicleFactory;

public class Main {

    public static void main(String[] args) {
        Vehicle red1 = VehicleFactory.getVehicle("red");
        Vehicle red2 = VehicleFactory.getVehicle("red");

        Vehicle blue1 = VehicleFactory.getVehicle("blue");

        System.out.println("Red1 memory address: " + red1);
        System.out.println("Red2 memory address: " + red2);
        System.out.println("Blue1 memory address: " + blue1);
    }
}
