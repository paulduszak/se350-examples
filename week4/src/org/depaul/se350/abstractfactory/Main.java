package org.depaul.se350.abstractfactory;

import org.depaul.se350.abstractfactory.aircraft.Aircraft;
import org.depaul.se350.abstractfactory.aircraft.factory.AircraftFactory;
import org.depaul.se350.abstractfactory.aircraft.factory.BritishAircraftFactory;
import org.depaul.se350.abstractfactory.aircraft.factory.USAircraftFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Aircraft> aircraftInventory = new ArrayList();

        AircraftFactory usAircraftFactory = new USAircraftFactory();
        AircraftFactory britishAircraftFactory = new BritishAircraftFactory();

        aircraftInventory.add(usAircraftFactory.createAircraft("HeavyTransport"));
        aircraftInventory.add(usAircraftFactory.createAircraft("LightTransport"));
        aircraftInventory.add(britishAircraftFactory.createAircraft("HeavyTransport"));
        aircraftInventory.add(britishAircraftFactory.createAircraft("LightTransport"));

        aircraftInventory.forEach(aircraft -> System.out.println(aircraft));
    }
}
