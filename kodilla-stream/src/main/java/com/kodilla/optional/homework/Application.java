package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {
    public static void main(String[] args) {

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Maria Kowalska"));
        teachers.add(new Teacher("Janusz Wicher"));
        teachers.add(new Teacher("Ewa Tomik"));
        teachers.add(new Teacher(null));


        List<Student> allStudents = new ArrayList<>();
        allStudents.add(new Student("Kasia Ząbek", teachers.get(0)));
        allStudents.add(new Student("Jacek Placek", teachers.get(1)));
        allStudents.add(new Student("Lucyna Modrzejewska", teachers.get(2)));
        allStudents.add(new Student("Paweł Miły", null));
        allStudents.add(new Student("Kuba Zielonka", null));
        allStudents.add(new Student("Dorota Kot", teachers.get(3)));


        for (Student student : allStudents) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

            System.out.println("Student: " + student.name + ", " + "Teacher: " + teacherName);
        }


    }
}
