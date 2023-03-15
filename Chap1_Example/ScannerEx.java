package Chap1_Example;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		System.out.print("Please enter the name, age, city:");
		
		Scanner input = new Scanner(System.in);
		
		String name = input.next();
		byte age = input.nextByte();
		String city = input.next();
		String single = input.next();
		
		System.out.println(name + ", " + age 
				            + ", " + city + ", " + 
				           single);
		
	}
}
