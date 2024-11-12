package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;


public class ForumStats {
    public static void main(String[] args) {
        System.out.println(avgPostsUsersOver40() + " " + avgPostsUsersUnder40());
    }

    public static double avgPostsUsersOver40() {
        double avgOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        return avgOver40;
    }

    public static double avgPostsUsersUnder40() {
        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        return avgUnder40;
    }

}