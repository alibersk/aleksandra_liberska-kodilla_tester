package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("0001"));
        warehouse.addOrder(new Order("0002"));
        warehouse.addOrder(new Order("0003"));
        warehouse.addOrder(new Order("0004"));

        try {
            Order order = warehouse.getOrder("0001");
            System.out.println("Order " + order.getNumber() + " exists");
        } catch (OrderDoesntExistException e) {
            System.out.println("The order does not exist");
        }

        try {
            Order order = warehouse.getOrder("1000");
            System.out.println("Order " + order.getNumber() + " exists");
        } catch (OrderDoesntExistException e) {
            System.out.println("The order does not exist");
        }
    }

}
