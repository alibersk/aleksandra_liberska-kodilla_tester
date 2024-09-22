package com.kodilla.inheritance.homework;

public class SystemAlpha extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("System Alpha turned on");
    }

    public SystemAlpha (int year, int price) {
        super(year, price);
    }
}
