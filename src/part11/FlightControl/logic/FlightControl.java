package part11.FlightControl.logic;

import part11.FlightControl.domain.Airplane;
import part11.FlightControl.domain.Flight;
import part11.FlightControl.domain.Place;

import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private HashMap<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String planeID, int planeCapacity) {
        Airplane newAirplane = new Airplane(planeID, planeCapacity);
        airplanes.put(planeID, newAirplane);
    }

    public void addFlight(Airplane plane, String departureAirportID, String targetAirportID) {
        this.places.putIfAbsent(departureAirportID, new Place(departureAirportID));
        this.places.putIfAbsent(targetAirportID, new Place(targetAirportID));

        Flight flight = new Flight(plane, this.places.get(departureAirportID), this.places.get(targetAirportID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String id) {
        return this.airplanes.get(id);
    }
}
