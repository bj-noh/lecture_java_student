package Chap4_Example;

public class _06_Method {
	
	private int year;
	private String month;
	private int day;
	
	public String name;	
	
    // 메소드 정의
    public static void sayHello() {
        System.out.println("This is sayHello() method");
    }
        
    public static double setSize(int w, int i) {
    	double result = (w * i / 2.);
    	return result;
    }

    public static void main(String[] args) {
        System.out.println("Before method call");
        sayHello();
        System.out.println("After method call");
        
        int num1 = 1;
        int num2 = 3;
        double result = setSize(1, 3);
        System.out.println(result);
    }
}
