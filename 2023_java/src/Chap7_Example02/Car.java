package Chap7_Example02;

public class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }
    
    @Override
    public void start() {
        System.out.println("The car starts.");
    }
}
