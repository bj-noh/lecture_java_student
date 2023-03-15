package Chap1_Example;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.141592;
		
		// double radius = 10.1;
		System.out.print("Enter the radius and height: ");
		double radius = input.nextDouble();
		double height = input.nextDouble();
		
		double circle_area = radius * radius * PI;
		
		double volume = circle_area * height;

		System.out.print("Radius = " + radius);
		System.out.print(", Volume = " + volume);
		
	}

}
