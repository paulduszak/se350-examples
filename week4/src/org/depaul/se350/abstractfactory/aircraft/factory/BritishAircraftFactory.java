package org.depaul.se350.abstractfactory.aircraft.factory;

import org.depaul.se350.abstractfactory.aircraft.*;

public class BritishAircraftFactory implements AircraftFactory {

    public Aircraft createAircraft(String type) {
        if (type.equals("LightTransport"))
            return new BritishLightTransportCraft();
        else if (type.equals("HeavyTransport"))
            return new BritishHeavyTransportCraft();
        else return null;
    }
}
