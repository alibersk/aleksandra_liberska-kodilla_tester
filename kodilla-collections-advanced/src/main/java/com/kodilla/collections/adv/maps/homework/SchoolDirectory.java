package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();

        Principal janusz = new Principal("Janusz", "Krzak");
        Principal ewa = new Principal("Ewa", "Kwiatkowska");
        Principal zofia = new Principal("Zofia", "Pietrzak");

        School sp1 = new School("SP nr 1 w Krakowie", Arrays.asList(25, 20, 30));
        School sp2 = new School("SP nr 2 w Miechowie", Arrays.asList(20, 22, 23, 30));
        School sp3 = new School("SP nr 3 w Olkuszu", Arrays.asList(18, 25, 27, 20, 24));

        directory.put(janusz, sp1);
        directory.put(ewa, sp2);
        directory.put(zofia, sp3);

        for (Map.Entry<Principal, School> directoryEntry : directory.entrySet())
            System.out.println("Principal " + directoryEntry.getKey().getFirstName() + " "
                    + directoryEntry.getKey().getLastName() + ", "
                    + directoryEntry.getValue().getSchoolName() + "; "
                    + "Number of students: " + directoryEntry.getValue().sumUpStudentNumber());
    }
}
