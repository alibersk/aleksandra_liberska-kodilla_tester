package interfaces.homework;

public class Opel implements Car {
    private double speed;

    public Opel(double speed){
        this.speed = speed;
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
