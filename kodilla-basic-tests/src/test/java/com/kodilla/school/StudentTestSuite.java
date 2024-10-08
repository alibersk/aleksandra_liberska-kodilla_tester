package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {
    @Test
    public void averageShouldBeZeroIfStudentDontHaveGrades() {
        Student student = new Student("Martin");
        assertEquals(0, student.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateStudentAverage() {
        Student student = new Student("Martin");
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);
        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);
        assertEquals(2.375, student.getAverage(), 0.001);
    }
}
