package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    @Test
    public void checkExistingStudentTeacherPair() {
        //given
        List<Teacher> teachers = List.of(
                new Teacher("Maria Kowalska")
        );
        List<Student> students = List.of(
                new Student("Kasia Ząbek", teachers.get(0))
        );

        //when
        String result1 = teachers.get(0).getName();
        String result2 = students.get(0).getName();
        String result3 = students.get(0).getTeacher().getName();
        //then
        assertEquals(result1, "Maria Kowalska");
        assertEquals(result2, "Kasia Ząbek");
        assertEquals(result3, "Maria Kowalska");
    }

    @Test
    public void checkStudentWithNoTeacher() {
        //given
        List<Teacher> teachers = List.of(
                new Teacher("Maria Kowalska")

        );
        List<Student> students = List.of(
                new Student("Ala Maj", null)
        );

        //when
        Teacher result = students.get(0).getTeacher();
        //then
        assertNull(result);
    }

}