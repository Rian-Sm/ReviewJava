package poobasics;

public class Car {
    private int topSpeed;
    private int gears;
    private String Model;

    public Car(int topSpeed, int gears, String Model) {
        this.topSpeed = topSpeed;
        this.gears = gears;
        this.Model = Model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
