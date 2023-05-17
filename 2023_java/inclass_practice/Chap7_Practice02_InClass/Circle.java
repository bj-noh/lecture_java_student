package Chap7_Practice02_InClass;

public class Circle extends AbstractShape {
	
	private int x, y, radius;	
	
	public Circle() {
		this(0, 0, 5);		
		System.out.println("Circle() constructor was excuted..");
		System.out.println();
	}
	
	public Circle(int x, int y) {
		this(x, y, 5);		
		System.out.println("Circle(int, int) constructor was excuted..");
		System.out.println();
	}
	
	public Circle(int x, int y, int radius) {
		System.out.println("Circle(int, int, int) constructor was excuted..");
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void showShapeInfo() {
		System.out.println("Circle Info");
		System.out.println("(x, y) = (" + this.x + ", " + this.y + "), radius = " + this.radius);
		System.out.println("Area of Circle: " + String.format("%.3f", getArea()));
		System.out.println("Color of the shape: " + getColor());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius, 2);
	}
	
}
