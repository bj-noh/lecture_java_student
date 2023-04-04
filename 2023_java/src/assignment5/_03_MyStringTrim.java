package assignment5;

import java.util.Scanner;

public class _03_MyStringTrim {
	
	public static void myStringTrim(String str) {

	    if (str == null || str.length() == 0) {
	        return;
	    }

        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 본 프로그램은 문자열을 입력받고,
		 * 앞/뒤에 공백이 포함된 문자열에서 공백을 제거하고 출력하는 프로그램이다.
		 * 본 프로그램이 아래 공백 제거 규칙에 맞게 동작하도록 myStringTrim() 메소드를 구현하여라.
		 * 공백 제거 규칙은 다음과 같다.
		 * 1. 문자열의 앞/뒤에 있는 모든 공백은 제거한다.
		 * 2. 만약 문자열 중간에 공백이 2개 이상 존재하는 경우 1개의 공백으로 만든다.
		 * 3. String 메소드 내 trim() 메소드는 사용할 수 없다.
		 * 
		 *    예시) 
		 *    input >>  "   test test       test       "
		 *    output >> "test test test" 
		 */
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string with space: ");
        String strInput = scanner.nextLine();
        
        myStringTrim(strInput);
	}

}
