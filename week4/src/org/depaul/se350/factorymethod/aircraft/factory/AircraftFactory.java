package org.depaul.se350.factorymethod.aircraft.factory;

import org.depaul.se350.factorymethod.aircraft.Aircraft;

public abstract class AircraftFactory {
    public abstract Aircraft createAircraft(String type);
}
