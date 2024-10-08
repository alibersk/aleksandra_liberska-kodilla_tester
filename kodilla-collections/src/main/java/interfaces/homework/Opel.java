package interfaces.homework;

public class Opel implements Car {
    public double speed;

    public Opel(double speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 0;
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
