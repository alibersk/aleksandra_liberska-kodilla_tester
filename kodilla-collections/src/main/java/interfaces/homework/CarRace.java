package interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(0);
        doRace(ford);
        System.out.println(ford.speed);
        Opel opel = new Opel(0);
        doRace(opel);
        System.out.println(opel.speed);
        Renault renault = new Renault(0);
        doRace(renault);
        System.out.println(renault.speed);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
    }
}
