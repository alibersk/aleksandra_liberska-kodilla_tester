package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void checkFilterChemistGroupUsernames() {
        //given
        List<String> expected = List.of(
                "Walter White",
                "Gale Boetticher"
                );
        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();

        //then
        assertEquals(expected, result);
        assertTrue(result.containsAll(expected));
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void checkFilterUsersOlderThan40() {
        //given
        List<User> expected = List.of(
                new User ("Walter White", 50, 7, "Chemists"),
                new User ("Gus Firing", 49, 0, "Board"),
                new User("Gale Boetticher", 44, 2, "Chemists"),
                new User ("Mike Ehrmantraut", 57, 0, "Security")
                );
        //when
        List<User> result = UsersManager.filterUsersOlderThan40();

        //then
        assertEquals(expected, result);
        assertTrue(result.containsAll(expected));
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void checkFilterNamesWithPosts() {
        //given
        List<String> expected = List.of(
                "Walter White",
                "Jessie Pinkman",
                "Tuco Salamanca",
                "Gale Boetticher"
        );
        //when
        List<String> result = UsersManager.filterNamesWithPosts();

        //then
        assertEquals(expected, result);
        assertTrue(result.containsAll(expected));
        assertTrue(expected.containsAll(result));
    }
}