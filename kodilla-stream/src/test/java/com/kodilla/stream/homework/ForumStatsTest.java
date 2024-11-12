package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kodilla.stream.homework.ForumStats.avgPostsUsersOver40;
import static com.kodilla.stream.homework.ForumStats.avgPostsUsersUnder40;
import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    void checkAvgPostsUsersOver40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        double expected = users1
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersOver40();

        //then
        assertEquals(expected, result);
    }


    @Test
    void checkAddedYoungerUserAvgPostsUsersOver40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 39, 10, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersOver40();

        //then
        assertEquals(expected, result);
    }

    @Test
    void checkAddedOlderUserAvgPostsUsersOver40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 41, 10, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersOver40();

        //then
        assertNotEquals(expected, result);
        assertEquals(expected, 3.8);
    }

    @Test
    void checkAdded40yUserAvgPostsUsersOver40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 40, 10, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersOver40();

        //then
        assertNotEquals(expected, result);
        assertEquals(expected, 3.8);
    }

    @Test
    void checkAddedYoungerUserZeroPostsAvgPostsUsersOver40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 39, 0, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersOver40();

        //then
        assertEquals(expected, result);
    }

    @Test
    void checkAddedOlderUserZeroPostsAvgPostsUsersOver40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 40, 0, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersOver40();

        //then
        assertNotEquals(expected, result);
        assertEquals(expected, 1.8);
    }

    @Test
    void checkAvgPostsUsersUnder40() {
        //given
        List<User> users = UsersRepository.getUsersList();
        double expected = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersUnder40();

        //then
        assertEquals(expected, result);
    }

    @Test
    void checkAddedYoungerUserAvgPostsUsersUnder40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 39, 3, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersUnder40();

        //then
        assertNotEquals(expected, result);
        assertEquals(expected, 1589);
    }

    @Test
    void checkAddedOlderUserAvgPostsUsersUnder40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 41, 10, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersUnder40();

        //then
        assertEquals(expected, result);
    }

    @Test
    void checkAdded40yUserAvgPostsUsersUnder40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 40, 10, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersUnder40();

        //then
        assertEquals(expected, result);
    }

    @Test
    void checkAddedYoungerUserZeroPostsAvgPostsUsersUnder40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 39, 0, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersUnder40();

        //then
        assertNotEquals(expected, result);
        assertEquals(expected, 1588);
    }

    @Test
    void checkAddedOlderUserZeroPostsAvgPostsUsersUnder40() {
        //given
        List<User> users1 = UsersRepository.getUsersList();
        users1.add(new User("Alf Melmac", 41, 0, "Security"));

        double expected = users1
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        //when
        double result = avgPostsUsersUnder40();

        //then
        assertEquals(expected, result);
    }
}