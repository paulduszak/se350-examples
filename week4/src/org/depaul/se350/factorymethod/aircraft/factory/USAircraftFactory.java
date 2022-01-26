package org.depaul.se350.factorymethod.aircraft.factory;

import org.depaul.se350.factorymethod.aircraft.Aircraft;
import org.depaul.se350.factorymethod.aircraft.USHeavyTransportCraft;
import org.depaul.se350.factorymethod.aircraft.USLightTransportCraft;

public class USAircraftFactory extends AircraftFactory {
    public Aircraft createAircraft(String type) {
        if (type.equals("LightTransport"))
            return new USLightTransportCraft();
        else if (type.equals("HeavyTransport"))
            return new USHeavyTransportCraft();
        else return null;
    }
}
