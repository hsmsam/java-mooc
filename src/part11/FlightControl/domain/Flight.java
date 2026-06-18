package part11.FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place departureAirportID;
    private Place targetAirportID;

    public Flight(Airplane airplane, Place departureAirportID, Place targetAirportID) {
        this.airplane = airplane;
        this.departureAirportID = departureAirportID;
        this.targetAirportID = targetAirportID;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDepartureAirportID() {
        return departureAirportID;
    }

    public Place getTargetAirportID() {
        return targetAirportID;
    }

    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirportID + "-" + this.targetAirportID + ")";
    }
}
