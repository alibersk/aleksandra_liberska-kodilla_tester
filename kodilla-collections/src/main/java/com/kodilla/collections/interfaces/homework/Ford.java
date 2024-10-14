package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private double speed;
    String name;

    public Ford(double speed){
        this.speed = speed;
        this.name = "Ford";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 2;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 1.5;
    }
}
