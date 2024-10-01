package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        double area = a * b;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * a + 2 * b;
        return perimeter;
    }

}
