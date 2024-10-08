package interfaces.homework;

public class Ford implements Car {
    public double speed;

    public Ford(double speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 2;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 1.5;
    }
}
