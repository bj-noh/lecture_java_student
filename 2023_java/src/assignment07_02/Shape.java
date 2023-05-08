package assignment07_02;

public abstract class Shape {
	/*
	 * Shape 추상클래스 클래이며, 멤버 변수와 메소드는 다음과 같이 구성된다.
	 * 
	 * - x: int
	 * 		도형의 x좌표
	 * - y: int
	 * 		도형의 y좌표
	 * - color: String
	 * 		도형의 색상
	 * 
	 * + Shape(int x, int y, String color)
	 * 		파라미터로 입력받은 x, y, color값을 멤버 변수의 x, y, color에 할당하는 생성자
	 *  
	 * + <<abstract>> getArea(): double 
	 * 		도형의 면적을 반환하는 추상 메소드
	 * 
	 * + <<abstract>> getPerimeter(): double
	 * 		도형의 둘레을 반환하는 추상 메소드
	 * 
	 * + move(int dx, int dy): void
	 * 		도형을 이동시키는 메소드. 입력받은 dx, dy값 만큼 x, y를 각각 이동시키는 메소드
	 * 		
	 * + setColor(String color): void
	 * 		도형의 색상을 설정하는 메소드. 도형의 색상을 입력받은 color값으로 설정(변경)함
	 * 
	 * + getColor(): String
	 * 		도형의 현재 색상을 반환하는 메소드
	 * 
	 * + getX(): int
	 * 		도형의 현재 x값을 반환하는 메소드
	 * 
	 * + getY(): int
	 * 		도형의 현재 y값을 반환하는 메소드
	 * 
	 */	
	
}