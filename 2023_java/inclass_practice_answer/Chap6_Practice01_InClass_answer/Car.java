package Chap6_Practice01_InClass_answer;

public class Car extends Vehicle {
    private int numWheels;

    public Car(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void move() {
        System.out.println("Car moving");
    }

    public void drive() {
        System.out.println("Car driving");
    }

    public void park() {
        System.out.println("Car parked");
    }    
}