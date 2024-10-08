package interfaces.homework;

public class Renault implements Car {
    private double speed;

    public Renault(double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 1;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 1;
    }
}
