package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(5);

        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());

        Shape rectangle = new Rectangle(2, 4);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Shape circle = new Circle(3);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
