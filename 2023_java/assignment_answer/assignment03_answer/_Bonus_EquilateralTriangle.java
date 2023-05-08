package assignment03_answer;

import java.util.Scanner;

public class _Bonus_EquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
    	 * 정수형 변수 (n)을 입력받고, 1개~n개까지 순차적으로 쌓인 정삼각형을 출력하여라. 
    	 * 
    	 * 예시) 만약 n == 5인 경우 (5층)
    	          *
                 ***
                *****
               *******
              *********
         * 예시) 만약 n == 3인 경우 (3층)
    	          *
                 ***
                *****   
    	 */    	
    	
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();        
        
        for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {            
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
