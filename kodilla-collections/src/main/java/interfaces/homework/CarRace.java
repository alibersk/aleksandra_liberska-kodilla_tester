package interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(0);
        doRace(ford); 
        Opel opel = new Opel(0);
        doRace(opel);
        Renault renault = new Renault(0);
        doRace(renault);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
        System.out.println(car.getSpeed());
    }
}
