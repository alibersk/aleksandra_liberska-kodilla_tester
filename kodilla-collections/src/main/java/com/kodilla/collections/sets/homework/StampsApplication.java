package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Liberty", 1.8, 2.7, false));
        stamps.add(new Stamp("Washington", 2.0, 3, false));
        stamps.add(new Stamp("Queen", 1.9, 2.4, true));
        stamps.add(new Stamp("Arabian horse", 3, 2.4, true));
        stamps.add(new Stamp("Queen", 1.9, 2.4, false));
        stamps.add(new Stamp("Queen", 1.9, 2.4, true));
        stamps.add(new Stamp("Liberty", 1.8, 2.7, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
