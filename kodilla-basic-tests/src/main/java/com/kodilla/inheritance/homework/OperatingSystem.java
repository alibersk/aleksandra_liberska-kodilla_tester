package com.kodilla.inheritance.homework;

public class OperatingSystem {
 private int year;
 private int price;

    public void turnOn(){
        System.out.println("System turned on");
    }

    public void turnOff() {
        System.out.println("System turned off");
    }

    public OperatingSystem(int year, int price){
        this.year = year;
        this.price = price;
    }

    public void getYear() {
        System.out.println("Year: " + year);
    }

    public void getPrice() {
        System.out.println("Price: " + price);
    }
}
