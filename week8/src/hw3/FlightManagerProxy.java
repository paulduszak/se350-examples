package hw3;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.Flight;
import hw3.flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class FlightManagerProxy implements FlightManager {


    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception {
        System.out.println("A flight is being created.");
        return FlightManagerReal.getInstance().createFlight(type,  airline, origin, destination, passengerCapacity);
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception {
        System.out.println("A flight is being retrieved.");
        return FlightManagerReal.getInstance().getFlightByFlightNumber(flightNumber);
    }
}