package assignment5;

import java.util.Scanner;

public class _Bonus_MyStringIngReplace {
	
	public static String myStringReplace(String strInput, String strTarget, String strReplace) {

	    if (strInput == null || strTarget == null || strReplace == null) {
	        return "";
	    }

	    String newStr = ""; // 새로운 문자열을 저장할 String 타입 변수
	    
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////

	    return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 본 프로그램은 문자열 3개를 순서대로 입력받고,
		 * 첫번째 문자열에서, 두번째 문자열을 찾고, 세번째 문자열로 치환하는 프로그램이다.
		 * 본 프로그램이 정상적으로 작동하도록 myStringReplace() 메소드를 완성하여라.
		 * 예시)
		 * input >> 
		 * Enter the string with space: This is a hello mello wello hollo
		   Enter the target string for replace: ell
		   Enter the new string for replace: wwww
		   output >>
		   This is a hwwwwo mwwwwo wwwwwo hollo
		 */
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string with space: ");
        String strInput = scanner.nextLine();
        
        System.out.println("Enter the target string for replace: ");
        String strTarget = scanner.next();
        
        System.out.println("Enter the new string for replace: ");
        String strReplaced = scanner.next();
        
        System.out.println(myStringReplace(strInput, strTarget, strReplaced));
	}

}
