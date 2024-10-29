package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Balice");
        //then
        assertEquals(2, result.size());
        assertEquals("Bergamo", result.getFirst().arrival);
        assertEquals("Malaga", result.getLast().arrival);
        assertNotEquals("Alicante", result.getFirst().arrival);

    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Pyrzyce");
        //then
        assertEquals(1, result.size());
        assertEquals("Bergamo", result.get(0).departure);

    }

    @Test
    public void testFindFlightsFromNonExistentAirport() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Luton");
        //then
        assertEquals(0, result.size());

    }

    @Test
    public void testFindFlightsToNonExistentAirport() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Luton");
        //then
        assertEquals(0, result.size());
    }
}