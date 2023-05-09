package Chap6_Practice01_InClass_answer;

public class Tank extends Vehicle {
    private String cannonSize;

    public Tank(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public String getCannonSize() {
        return cannonSize;
    }

    public void setCannonSize(String cannonSize) {
        this.cannonSize = cannonSize;
    }

    public void move() {
        System.out.println("Tank moving");
    }

    public void fireCannon() {
        System.out.println("Tank firing cannon");
    }
}
