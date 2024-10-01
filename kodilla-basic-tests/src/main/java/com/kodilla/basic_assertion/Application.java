package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = Calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEqualsExpon(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = Calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEqualsExpon(-3, subtractResult);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double exponResult = Calculator.expon(a, b);
        boolean correctExpon = ResultChecker.assertEqualsExpon(390625, exponResult);
        if (correctExpon) {
            System.out.println("Metoda expon działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda expon nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
