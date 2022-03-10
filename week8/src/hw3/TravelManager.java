package hw3;

import hw3.airline.Airline;
import hw3.airline.AirlineFactory;
import hw3.airport.Airport;
import hw3.airport.AirportFactory;
import hw3.flight.Flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        FlightManager flightManagerProxy = new FlightManagerProxy();

        Airline airline = AirlineFactory.getAirline("Spirit");
        Airport origin = AirportFactory.getAirport("ORD");
        Airport destination = AirportFactory.getAirport("DFW");

        String flightNumber = flightManagerProxy.createFlight("commercialFlight", airline, origin, destination, 0);
        String flightNumber2 = flightManagerProxy.createFlight("passengerFlight", airline, origin, destination, 88);

        Optional<Flight> flight = flightManagerProxy.getFlightByFlightNumber(flightNumber);
        Optional<Flight> flight2 = flightManagerProxy.getFlightByFlightNumber(flightNumber2);

        System.out.println(flight.get());
        System.out.println(flight2.get());

    }

}
