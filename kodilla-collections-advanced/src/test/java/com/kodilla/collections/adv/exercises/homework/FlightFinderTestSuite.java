package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    FlightsTable repository = new FlightsTable() {
        @Override
        public List<Flight> getFlightsTable() {
            return FlightsTable.super.getFlightsTable();
        }
    };
    @Test
    public void testFindFlightsFrom() {
        //given
        FlightsTable repository = new FlightsTable() {
            @Override
            public List<Flight> getFlightsTable() {
                return List.of(
                        new Flight("JFK", "Okęcie")
                );
            }
        };
        FlightFinder flightFinder = new FlightFinder(repository);
        List<Flight> expected = List.of(
                new Flight("Balice", "Bergamo"),
                new Flight("Balice", "Malaga")
        );
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Balice");
        //then
        assertEquals(expected, result);

    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder(repository);
        //when
        List<Flight> result = flightFinder.findFlightsTo("Pyrzyce");
        //then
        assertEquals(1, result.size());
        assertEquals("Bergamo", result.get(0).departure);

    }

    @Test
    public void testFindFlightsFromNonExistentAirport() {
        //given
        FlightFinder flightFinder = new FlightFinder(repository);
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Luton");
        //then
        assertEquals(emptyList(), result);

    }

    @Test
    public void testFindFlightsToNonExistentAirport() {
        //given

        FlightFinder flightFinder = new FlightFinder(repository);
        //when
        List<Flight> result = flightFinder.findFlightsTo("Luton");
        //then
        assertEquals(0, result.size());
    }

}