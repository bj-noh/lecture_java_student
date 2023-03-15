package Chap2_Practice;

import java.util.Scanner;

public class _01_FCConverter {
    public static void main(String[] args) {
    	
    	/*
    	 * 화씨(fahrenheit, F)온도를 입력받고 이를 섭씨(celsius, C)로 변환하는 프로그램을 작성해라.
    	 * 참고:
    	 * F = (9C/5) + 32
    	 */
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius;
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
        
        System.out.println(fahrenheit + " degree Fahrenheit ==> " + celsius + " degree Celsius.");
    }
}