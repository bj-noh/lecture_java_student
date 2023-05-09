package Chap6_Practice01_InClass_answer;

public class Autonomous extends Car {
    public Autonomous(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void autoPilot() {
        System.out.println("Autonomous car driving in auto-pilot mode");
    }
}