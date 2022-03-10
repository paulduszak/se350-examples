package hw3;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.Flight;
import hw3.flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class FlightManagerReal implements FlightManager {

    private static FlightManagerReal ourInstance;
    private static List<Flight> flights;

    public static FlightManagerReal getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManagerReal();

        return ourInstance;
    }

    private FlightManagerReal() {
        flights = new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination, passengerCapacity);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}