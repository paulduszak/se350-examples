package org.depaul.se350.factorymethod.aircraft.factory;

import org.depaul.se350.factorymethod.aircraft.Aircraft;
import org.depaul.se350.factorymethod.aircraft.BritishHeavyTransportCraft;
import org.depaul.se350.factorymethod.aircraft.BritishLightTransportCraft;

public class BritishAircraftFactory extends AircraftFactory {

    public Aircraft createAircraft(String type) {
        if (type.equals("LightTransport"))
            return new BritishLightTransportCraft();
        else if (type.equals("HeavyTransport"))
            return new BritishHeavyTransportCraft();
        else return null;
    }
}
