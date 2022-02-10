package hw2;

import hw2.airline.Airline;
import hw2.airport.Airport;
import hw2.exception.BadParameterException;
import hw2.exception.NullParameterException;
import hw2.flight.CommercialFlight;
import hw2.flight.Flight;

import java.util.Optional;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");

            //CommercialFlight commercialFlight = new CommercialFlight(airline, origin, destination);
            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);

            System.out.println(flight.get());
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}
