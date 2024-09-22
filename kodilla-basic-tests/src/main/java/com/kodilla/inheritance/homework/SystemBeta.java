package com.kodilla.inheritance.homework;

public class SystemBeta extends OperatingSystem {
    @Override
    public void turnOff() {
        System.out.println("System Beta turned off");
    }

    public SystemBeta (int year, int price) {
        super(year, price);
    }
}
