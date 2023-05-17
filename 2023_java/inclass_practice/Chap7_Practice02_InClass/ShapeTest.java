package Chap7_Practice02_InClass;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		/*
		 * 결과:
		 *  Circle(int, int, int) constructor was excuted..
			Circle() constructor was excuted..
			
			Circle(int, int, int) constructor was excuted..
			Circle(int, int) constructor was excuted..
			
			Circle(int, int, int) constructor was excuted..
			
			Rectangle(int, int, int, int) constructor was excuted..
			Rectangle() constructor was excuted..
			
			Rectangle(int, int, int, int) constructor was excuted..
			
			Circle Info
			(x, y) = (0, 0), radius = 5
			Area of Circle: 78.540
			Color of the shape: Green
			
			Circle Info
			(x, y) = (3, 2), radius = 5
			Area of Circle: 78.540
			Color of the shape: Red
			
			Circle Info
			(x, y) = (5, 5), radius = 2
			Area of Circle: 12.566
			Color of the shape: Blue
			
			Rectangle Info
			(x1, y1) = (0, 0)
			(x2, y2) = (5, 5)
			Area of Rectangle: 25.00000
			Color of the shape: Yellow
			
			Rectangle Info
			(x1, y1) = (3, -2)
			(x2, y2) = (5, 10)
			Area of Rectangle: 24.00000
			Color of the shape: Purple

		 */
		Circle circle_1 = new Circle();
		Circle circle_2 = new Circle(3, 2);
		Circle circle_3 = new Circle(5, 5, 2);
		System.out.println();
		
		circle_1.setColor("Green");
		circle_2.setColor("Red");
		circle_3.setColor("Blue");
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(3, -2, 5, 10);	
		System.out.println();
		
		rect1.setColor("Yellow");
		rect2.setColor("Purple");
		
		circle_1.showShapeInfo();
		System.out.println();
		circle_2.showShapeInfo();
		System.out.println();
		circle_3.showShapeInfo();
		System.out.println();
		rect1.showShapeInfo();
		System.out.println();		
		rect2.showShapeInfo();
	}

}
