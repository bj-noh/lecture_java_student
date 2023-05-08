package Chap3_Practice01_InClass_answer;

import java.util.Scanner;

public class _04_ReverseTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		/*
		 * 
		 * 정수형 변수 (n)를 입력받고, 아래와 같이 1개~n개까지 우측하단이 직각인 *로 구성된 직각 삼각형을 출력하는 프로그램을 작성하라.
		 * 예시) n = 8
	
                *
               **
              ***
             ****
            *****
           ******
          *******
         ********

		 HINT: 
         SSSSSSS*
         SSSSSS**
         SSSSS***
         SSSS****
         SSS*****
         SS******
         S*******
         ********
         */
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
