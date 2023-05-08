package Chap5_Practice01_InClass;
import java.util.Scanner;

public class _01_CharCounter {
	
	public static int findChar(String str, char c) {
		
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 본 프로그램은 문자열 1개와 문자 1개를 입력받아 문자열에서 해당 문자의 개수를 출력하는 프로그램이다.
		 * 본 프로그램이 정상적으로 작동하도록 findChar() 메소드를 완성하라.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string : ");
		String str = sc.next();

		System.out.print("Enter the target character : ");
		char c = sc.next().charAt(0);
			
		int result = findChar(str, c);
			
		System.out.println("Number of " + "\'" + c + "\' = " + result);
	}

}
