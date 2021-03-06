package org.depaul.se350.simplefactory.aircraft.factory;

import org.depaul.se350.simplefactory.aircraft.Aircraft;
import org.depaul.se350.simplefactory.aircraft.HeavyTransportCraft;
import org.depaul.se350.simplefactory.aircraft.LightTransportCraft;

public class USAircraftFactory {
    private USAircraftFactory() {
    }

    public Aircraft createAircraft(String type) {
        if (type.equals("LightTransport"))
            return new LightTransportCraft();
        else if (type.equals("HeavyTransport"))
            return new HeavyTransportCraft();
        else return null;
    }
}
