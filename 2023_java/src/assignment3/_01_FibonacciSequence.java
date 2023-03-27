package assignment3;

import java.util.Scanner;

public class _01_FibonacciSequence {

    public static void main(String[] args) {
    	/*
    	 * 정수 하나를 입력받고 (index) 해당 정수항까지의 피보나치 수열을 출력하는 프로그램을 작성하여라.
    	 * 피보나치 수열: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    	 * 위와 같이 앞의 두 수를 더한 값을 현재의 값으로 갖는 수열을 피보나치 수열이라고 함 (첫번째항=0, 두번째항=1)
    	 * (index는 0부터 시작함)
    	 * 
    	 * 예시1) num = 4
		 * 출력: 
		 * Fibonacci sequence up to index 4: 0 1 1 2 3
		 *  
    	 * 예시2) num = 10
		 * 출력: 
		 * Fibonacci sequence up to index 10: 0 1 1 2 3 5 8 13 21 34 55 
		 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci sequence up to index " + index + ": ");

        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }
}