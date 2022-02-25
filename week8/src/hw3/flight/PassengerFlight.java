package hw3.flight;

import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.exception.NullParameterException;

import java.util.Objects;

public class PassengerFlight extends Flight {

    private int passengerCapacity;

    public PassengerFlight(Airline airline, Airport origin, Airport destination, int passengerCapacity) throws NullParameterException {
        super(airline, origin, destination);
        setPassengerCapacity(passengerCapacity);
    }


    public void setPassengerCapacity(int passengerCapacity) {
        // perform a check to ensure passengerCapacity > 0
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerFlight that = (PassengerFlight) o;
        return passengerCapacity == that.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity);
    }

    @Override
    public String toString() {
        return super.toString() +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}
