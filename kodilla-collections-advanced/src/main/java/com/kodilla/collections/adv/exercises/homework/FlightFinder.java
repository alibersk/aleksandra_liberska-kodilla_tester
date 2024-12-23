package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

        private List<Flight> flights;

        public FlightFinder(FlightsTable repository) {
            this.flights = repository.getFlightsTable();
        }

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure))
                result.add(flight);
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival))
                result.add(flight);
        }
        return result;
    }

}
