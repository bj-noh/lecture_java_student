package Chap3_Practice01_InClass_answer;

import java.util.Scanner;

public class _03_Triangle {
    public static void main(String[] args) {
	// TODO Auto-generated method stub

		/*
		 * 
		 * 정수형 변수 (n)를 입력받고, 아래와 같이 1개~n개까지 순차적으로 쌓인 *로 구성된 직각 삼각형을 출력하는 프로그램을 작성하라.
		 * 예시) n = 8
	
			    *
			    **
			    ***
			    ****
			    *****
			    ******
			    *******
			    ********
	
	     */
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
    }
}
