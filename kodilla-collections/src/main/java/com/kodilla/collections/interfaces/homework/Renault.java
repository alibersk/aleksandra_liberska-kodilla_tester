package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {
    private double speed;
    String name;

    public Renault(double speed){
        this.speed = speed;
        this.name = "Renault";
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
        speed = speed + 1;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 1;
    }
}
