package Chap7_Practice02_InClass;

public abstract class AbstractShape {
	private String color;
	
	abstract public double getArea();
	
	public String getColor() { return this.color; }
	public void setColor(String color) { this.color = color; }
	
	public void showShapeInfo() {
		System.out.println("Color of the shape: " + this.color);
	}
}
