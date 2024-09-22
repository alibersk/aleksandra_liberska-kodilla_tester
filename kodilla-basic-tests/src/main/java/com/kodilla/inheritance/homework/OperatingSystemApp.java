package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2022, 1000);
        operatingSystem.turnOn();
        operatingSystem.getYear();

        SystemAlpha systemAlpha = new SystemAlpha(2023, 1200);
        systemAlpha.turnOn();
        systemAlpha.getYear();
        systemAlpha.getPrice();

        SystemBeta systemBeta = new SystemBeta(2024, 1250);
        systemBeta.turnOff();
        systemBeta.getYear();
        systemBeta.getPrice();
    }
}
