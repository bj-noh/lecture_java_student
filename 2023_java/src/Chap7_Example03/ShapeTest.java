package Chap7_Example03;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape myShape = new Shape("red");
        System.out.println("My shape's color is " + myShape.getColor());

        Circle myCircle = new Circle("blue", 3.0);
        System.out.println("My circle's color is " + myCircle.getColor());
        System.out.println("My circle's radius is " + myCircle.getRadius());
        System.out.println("My circle's area is " + myCircle.getArea());

        Rectangle myRectangle = new Rectangle("green", 4.0, 5.0);
        System.out.println("My rectangle's color is " + myRectangle.getColor());
        System.out.println("My rectangle's width is " + myRectangle.getWidth());
        System.out.println("My rectangle's height is " + myRectangle.getHeight());
        System.out.println("My rectangle's area is " + myRectangle.getArea());
    }
}
