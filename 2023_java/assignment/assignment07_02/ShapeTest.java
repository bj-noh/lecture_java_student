package assignment07_02;

public class ShapeTest {
    public static void main(String[] args) {
    	
    	/*
    	 * 본 프로그램은 Shape 추상 클래스로부터 상속받아 구현한 Rectangle 클래스와 Circle 클래스를 테스트하는 프로그램이다.
    	 * 아래 내용이 잘 동작할 수 있도록 Shape, Rectangle, Circle 클래스를 구현하고, 다음과 같은 결과를 출력하도록 main 메소드를 완성하여라.
    	 * 
    	 * 결과> 
    	 *	Rectangle: x=0, y=0, width=10.0, height=20.0, color=blue, area=200.0, perimeter=60.0
			Circle: x=5, y=5, radius=7.5, color=red, area=176.71458676442586, perimeter=47.12388980384689
			=== After moving rectangle by x+5, y+10 ===
			=== After moving circle by x-2, y+3 ===
			Rectangle after moving: x=5, y=10
			Circle after moving: x=3, y=8
    	 */
    	
        Rectangle rectangle = new Rectangle(0, 0, "blue", 10, 20);
        Circle circle = new Circle(5, 5, "red", 7.5);
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }
}
