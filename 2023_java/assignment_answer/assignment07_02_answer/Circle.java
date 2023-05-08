package assignment07_02_answer;

public class Circle extends Shape {
	/*
	 * Circle 클래스는 Shape 추상 클래스를 상속받으며,
	 * 멤버 변수와 메소드는 다음과 같이 구성된다.
	 * 
	 * - radius: double
	 * 		원의 반지름
	 * 
	 * + Circle(int x, int y, String color, double radius)
	 * 		입력받은 x, y, color값을 상위 클래스인 Shape 클래스의 멤버에 할당하고, radius는 Circle 클래스의 멤버 변수 radius에 할당하는 생성자 
	 *  
	 * + getArea(): double
	 * 		Circle의 면적을 반환하는 메소드
	 * 
	 * + getPerimeter(): double
	 * 		Circle의 둘레를 반환하는 메소드
	 * 
	 * + setRadius(double radius): void
	 * 		Circle의 반지름을 입력받은 파라미터로 설정(변경)하는 메소드
	 * 
	 * + getRadius(): double
	 * 		Circle의 반지름을 반환하는 메소드
	 */
	
	
    private double radius;
    
    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
}