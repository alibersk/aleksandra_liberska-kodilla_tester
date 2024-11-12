package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;



public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        List<User> usersOlderThan40 = filterUsersOlderThan40();
        List<String> usersWithPosts = filterNamesWithPosts();
        System.out.println(chemistGroupUsernames);
        System.out.println(usersOlderThan40);
        System.out.println(usersWithPosts);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterUsersOlderThan40() {
        List<User> usersOlderThan40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 40)
                .collect(Collectors.toList());

        return usersOlderThan40;
    }

    public static List<String> filterNamesWithPosts() {
        List<String> usersWithPosts = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usersWithPosts;
    }
}
