package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String schoolName;
    private List<Integer> schoolStudents = new ArrayList<>();

    public School(String schoolName, List<Integer> schoolStudents) {
        this.schoolName = schoolName;
        this.schoolStudents = schoolStudents;
    }

    public List<Integer> getSchoolStudents() {
        return schoolStudents;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int displayStudentNumber() {
        int studentNumber = 0;
        for (int i = 0; i < schoolStudents.size(); i++) {
            studentNumber = schoolStudents.get(i) + studentNumber;
        }
        return studentNumber;
    }

    public int sumUpStudentNumber() {
        int sumUpStudentNumber = 0;
        for (Integer school : schoolStudents) {
            sumUpStudentNumber = displayStudentNumber();
        }
        return sumUpStudentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) && Objects.equals(schoolStudents, school.schoolStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, schoolStudents);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolStudents=" + schoolStudents +
                '}';
    }
}
