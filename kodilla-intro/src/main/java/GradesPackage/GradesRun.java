package GradesPackage;

public class GradesRun {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.add(4);
        grades.add(3);
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(4);
        grades.add(2);
        grades.add(4);
        grades.add(3);
        grades.add(3);
        grades.lastGrade();
        System.out.println("Last grade: " + grades.lastGrade());
        grades.getAverage();
        System.out.println("Average: " + grades.getAverage());
    }
}
