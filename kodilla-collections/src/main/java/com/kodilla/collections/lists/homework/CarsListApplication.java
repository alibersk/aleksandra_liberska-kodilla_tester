package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

import static arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Ford(12));
        cars.add(new Opel(31));
        cars.add(new Renault(29));
        cars.add(new Ford(25));
        cars.add(new Opel(16));
        cars.add(new Renault(9));
        Car car7 = new Ford(22);
        cars.add(car7);

        for (Car car : cars) {
            describeCar(car);
        }

        cars.remove(5);
        cars.remove(car7);

        System.out.println("-----------------------------");
        System.out.println("Cars currently on the list: " + cars.size());

        for (Car car : cars) {
            describeCar(car);
        }
    }
}
