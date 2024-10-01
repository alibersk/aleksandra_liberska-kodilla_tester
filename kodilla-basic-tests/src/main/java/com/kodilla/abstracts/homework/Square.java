package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double x;

    public Square(double x) {
        this.x = x;
    }

    @Override
    public double calculateArea() {
        double area = x * x;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * x;
        return perimeter;
    }
}
