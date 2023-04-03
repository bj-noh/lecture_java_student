package Chap4_Example;

public class _10_Overrloading {
	
	public static int square(int i) {
		return i * i;
	}
	
	public static double square(double d) {
		return d * d;
	}
	
	public static void main(String[] args) {
		int i = 10;
		double d = 20;
		
		System.out.println(square(i));
		System.out.println(square(d));
	}

}
