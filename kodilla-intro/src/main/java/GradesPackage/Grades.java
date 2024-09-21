package GradesPackage;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (size >= 10) {
            System.out.println("Max number of grades has been reached.");
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public double getAverage() {
        if (size == 0) {
            return 0;
        }
        double sum = 0;
        for (int n = 0; n < size; n++) {
            sum += grades[n];
        }
        return sum / size;
    }

    public int lastGrade() {
        if (size == 0) {
            return -1;
        }
        return grades[size - 1];
    }
}

