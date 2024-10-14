package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private double speed;
    String name;

    public Opel(double speed){
        this.speed = speed;
        this.name = "Opel";
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
        speed = speed + 3;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 2;
    }
}
