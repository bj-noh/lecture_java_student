package Chap7_Example05;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClass superClass = new SuperClass();		
		superClass.methodA();		
		superClass.methodB();
		
		System.out.println();
		System.out.println();

		SubClass subClass = new SubClass();
		subClass.methodA();
		subClass.methodB();
	}

}
