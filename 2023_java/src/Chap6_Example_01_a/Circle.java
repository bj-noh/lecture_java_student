package Chap6_Example_01_a;

public class Circle {
	
	int radius;
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
    public static void main(String[] args) {
    	Circle circle1;
    	
    	circle1 = new Circle();
    	
    	circle1.radius = 10;
    	
    	System.out.println(circle1.getArea());
    	
    }
}
