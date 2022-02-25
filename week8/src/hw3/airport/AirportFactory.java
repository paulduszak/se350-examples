package hw3.airport;

import hw3.airline.Airline;
import hw3.exception.BadParameterException;
import hw3.exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {

    private static Map<String, Airport> airports = new HashMap<>();

    public static Airport getAirport(String airport) {
        return airports.computeIfAbsent(airport, (an) -> {
            try {
                return new Airport(an);
            } catch (NullParameterException | BadParameterException e) {
                e.printStackTrace();
            }

            return null;
        });
    }
}
