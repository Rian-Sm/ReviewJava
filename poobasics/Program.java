package poobasics;

public class Program {
    public static void main(String[] args) {

        Car car1 = new Car(200, 6, "Toyota");
        Car car2 = new Car(250, 6, "Honda");

        System.out.println("Car 1 top speed: " + car1.getTopSpeed());
        System.out.println("Car 2 top speed: " + car2.getTopSpeed());
    }
}
