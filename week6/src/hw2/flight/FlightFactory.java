package hw2.flight;

import hw2.airline.Airline;
import hw2.airport.Airport;
import hw2.exception.NullParameterException;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }

        else return null;
    }
}
