package Chap6_Practice01_InClass_answer;

public class Airplane extends Vehicle {
    private double wingspan;

    public Airplane(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void move() {
        System.out.println("Airplane moving");
    }

    public void takeOff() {
        System.out.println("Airplane taking off");
    }

    public void land() {
        System.out.println("Airplane landing");
    }
}