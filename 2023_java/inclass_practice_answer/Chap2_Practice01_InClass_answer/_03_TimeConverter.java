package Chap2_Practice01_InClass_answer;

import java.util.Scanner;

public class _03_TimeConverter {
    public static void main(String[] args) {
    	
    	/*
    	 * 초를 입력받고, 해당 초의 시, 분, 초를 % 와 / 연산을 이용하여 계산하고 출력하는 프로그램을 작성하여라.
    	 */
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60; // 1 minute = 60 seconds
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}