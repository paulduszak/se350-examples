package org.depaul.se350.abstractfactory.aircraft.factory;

import org.depaul.se350.abstractfactory.aircraft.Aircraft;

public interface AircraftFactory {
    Aircraft createAircraft(String type);
}
