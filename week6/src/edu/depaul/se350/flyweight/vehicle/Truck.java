package edu.depaul.se350.flyweight.vehicle;

public class Truck implements Vehicle {
    private String color;

    public Truck(String color) {
        setColor(color);
    }

    private void setColor(String colorIn) {
        color = colorIn;
    }

    public String getColor() {
        return color;
    }
}
