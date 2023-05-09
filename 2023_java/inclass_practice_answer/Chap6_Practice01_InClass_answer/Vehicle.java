package Chap6_Practice01_InClass_answer;

public class Vehicle {
    private String manufacturer;
    private String model;

    public Vehicle() {
    	this("Vehicle manufacturer", "Model");
    }

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    public void move() {
        System.out.println("Vehicle moving");
    }

    public void printInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
    }
}