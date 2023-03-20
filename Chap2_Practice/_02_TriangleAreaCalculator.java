package Chap2_Practice;

import java.util.Scanner;

public class _02_TriangleAreaCalculator {
    public static void main(String[] args) {
    	/*
    	 * 삼각형의 밑변과 높이를 실수형 변수로 각각 입력받고, 삼각형의 넓이를 구하는 프로그램을 작성하여라.  
    	 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();

        double area;        

        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
        
        
        System.out.println("Area of triangle with base " + base + " and height " + height + " is " + area);
    }
}