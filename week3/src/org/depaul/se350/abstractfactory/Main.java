package org.depaul.se350.abstractfactory;

import org.depaul.se350.abstractfactory.aircraft.Aircraft;
import org.depaul.se350.abstractfactory.aircraft.factory.USAircraftFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Aircraft> aircraftInventory = new ArrayList();
        aircraftInventory.add(USAircraftFactory.createAircraft("HeavyTransport"));
        aircraftInventory.add(USAircraftFactory.createAircraft("LightTransport"));

        aircraftInventory.forEach(aircraft -> System.out.println(aircraft));
    }
}
