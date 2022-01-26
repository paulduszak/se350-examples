package org.depaul.se350.abstractfactory.aircraft.factory;

import org.depaul.se350.abstractfactory.aircraft.Aircraft;
import org.depaul.se350.abstractfactory.aircraft.USHeavyTransportCraft;
import org.depaul.se350.abstractfactory.aircraft.USLightTransportCraft;

public class USAircraftFactory implements AircraftFactory {
    public Aircraft createAircraft(String type) {
        if (type.equals("LightTransport"))
            return new USLightTransportCraft();
        else if (type.equals("HeavyTransport"))
            return new USHeavyTransportCraft();
        else return null;
    }
}
