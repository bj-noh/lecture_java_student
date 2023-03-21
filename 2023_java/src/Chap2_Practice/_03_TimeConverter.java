package Chap2_Practice;

import java.util.Scanner;

public class _03_TimeConverter {
    public static void main(String[] args) {
    	/*
    	 * 초를 입력받고, 해당 초의 시, 분, 초를 % 와 / 연산을 이용하여 계산하고 출력하는 프로그램을 작성하여라.
    	 */
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours, minutes, seconds;
        

        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
        
        System.out.println(totalSeconds + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}