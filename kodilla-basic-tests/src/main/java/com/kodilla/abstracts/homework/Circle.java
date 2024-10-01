package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * r * r;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * r * Math.PI;
        return perimeter;
    }
}
