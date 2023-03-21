package assignment2;
import java.util.Scanner;

public class _01_BiggestNumber {	
	public static void main(String[] args) {
		/*
		 * 숫자 세 개를 입력 받고, 그 중 가장 큰 수를 찾는 프로그램을 작성하라.
		 * 단, 반드시 삼항연산자의 중첩을 활용하여야 하며, 코드는 한 줄 이상 넘어가면 안됨. (공간 부족으로 인한 자동 줄바꿈은 인정)
		 * 
		 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int biggestNum;        

        /////////////// CODE HERE ///////////////
        
        // only one line //
        
        /////////////////////////////////////////

        System.out.println("The biggest number is: " + biggestNum);
	}
}

