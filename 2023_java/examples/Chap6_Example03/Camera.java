package Chap6_Example03;

public class Camera {
    private String model;
    private int megapixels;
    private double price;
    private boolean hasWifi;

    public Camera(String model, int megapixels, double price, boolean hasWifi) {
        this.model = model;
        this.megapixels = megapixels;
        this.price = price;
        this.hasWifi = hasWifi;
    }

    public String getModel() { return model; }

    public int getMegapixels() { return megapixels; }

    public double getPrice() { return price; }

    public boolean hasWifi() { return hasWifi; }

    public void showCameraInfo() {
        String wifi = hasWifi ? "Yes" : "No";
        System.out.println("Model: " + model + "\nMegapixels: " + megapixels + "\nPrice: " + price + "\nWiFi: " + wifi);
    }

    public void takePhoto() {
        System.out.println("Click! A photo has been taken.");
    }

    public void zoomIn() {
        System.out.println("Zooming in...");
    }

    public void zoomOut() {
        System.out.println("Zooming out...");
    }
}
