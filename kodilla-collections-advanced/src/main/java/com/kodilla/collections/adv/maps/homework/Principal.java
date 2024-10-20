package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Principal {
    private String firstName;
    private String lastName;

    private List<String> principalNames = new ArrayList<>();

    public Principal(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal that = (Principal) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(principalNames, that.principalNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, principalNames);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", principalNames=" + principalNames +
                '}';
    }
}
