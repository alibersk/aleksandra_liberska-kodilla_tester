package interfaces.homework;

public class Renault implements Car {
    public double speed;

    public Renault(double speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 0;
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
