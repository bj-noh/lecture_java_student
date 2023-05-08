package Chap7_Example02;

public class Truck extends Vehicle {
    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    public void start() {
        System.out.println("The truck starts.");
    }
}
