package assignment2;

import java.util.Scanner;

public class _02_LeapYearChecker {
    public static void main(String[] args) {
    	
    	/*
    	 * 연도 (1999, 2023 등)를 입력받고 해당 연도가 윤년인지 판별하여라. &&, || 연산자 사용.
    	 * 참고:
    	 * 윤년 = 해당 연도가 4의 배수이면서 100의 배수가 아니면 윤년이다. 그러나, 400의 배수이면 윤년이다.  
    	 */
    	
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear;

        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}