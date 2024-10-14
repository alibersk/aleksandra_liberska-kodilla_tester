package arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int arrLength = getRandomArrLength();
        Car[] cars = new Car[arrLength];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int drawnShapeKind = RANDOM.nextInt(3);

        double speedIncrease = getRandomSpeedIncrease();
        if (drawnShapeKind == 0)
            return new Ford(speedIncrease);
        else if (drawnShapeKind == 1)
            return new Opel(speedIncrease);
        else
            return new Renault(speedIncrease);
    }

    private static double getRandomSpeedIncrease() {
        return RANDOM.nextDouble() * 100 + 1;
    }

    private static int getRandomArrLength() {
        return RANDOM.nextInt(15);
    }
}
