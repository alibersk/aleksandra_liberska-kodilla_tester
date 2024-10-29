package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight ("Alicante", "Lublinek"));
        flights.add(new Flight ("Bergamo", "Balice"));
        flights.add(new Flight ("Bergamo", "Pyrzyce"));
        flights.add(new Flight ("Balice", "Bergamo"));
        flights.add(new Flight ("Balice", "Malaga"));
        flights.add(new Flight ("Lublinek", "Alicante"));
        flights.add(new Flight ("Pyrzyce", "Bergamo"));
        flights.add(new Flight ("Malaga", "Balice"));
        return flights;
    }
}