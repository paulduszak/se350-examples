package org.depaul.se350.abstractfactory.aircraft.factory;

import org.depaul.se350.abstractfactory.aircraft.Aircraft;
import org.depaul.se350.abstractfactory.aircraft.HeavyTransportCraft;
import org.depaul.se350.abstractfactory.aircraft.LightTransportCraft;

public class USAircraftFactory {
    private USAircraftFactory() {
    }

    public static Aircraft createAircraft(String type) {
        if (type.equals("LightTransport"))
            return new LightTransportCraft();
        else if (type.equals("HeavyTransport"))
            return new HeavyTransportCraft();
        else return null;
    }
}
