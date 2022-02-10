package hw2;

import hw2.airline.Airline;
import hw2.airport.Airport;
import hw2.flight.Flight;
import hw2.flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public final class FlightManager {

    private static FlightManager ourInstance;
    private static List<Flight> flights;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }

    private FlightManager() {
        flights = new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination) {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}