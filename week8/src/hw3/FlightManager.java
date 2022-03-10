package hw3;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.Flight;

import java.util.Optional;

public interface FlightManager {
    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception;
    public Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception;
}
