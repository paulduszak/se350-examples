package hw3.flight;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight extends Flight {

    public CommercialFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        super(airline, origin, destination);
    }
}
