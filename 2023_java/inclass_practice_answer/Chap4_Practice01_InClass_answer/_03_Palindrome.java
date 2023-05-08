package Chap4_Practice01_InClass_answer;
import java.util.Scanner;

public class _03_Palindrome {
	
	public static Boolean Palindrome(String str) {
		
		int lenStr = str.length();		

        for (int i = 0; i < lenStr / 2; i++) {
        	if(str.charAt(i) != str.charAt(lenStr - i - 1)) {
        		return false;
        	}
        }
        
        return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 본 프로그램은 문자열 하나를 입력받아 해당 문자가 회문(palindrome)인지 아닌지 판별하는 프로그램이다.
		 * 본 프로그램은 하나의 입력 후 "z"가 입력받아질 때까지 반복적으로 동작한다.
		 * 회문은 "aba", "abbba", "abccba" 등과 같이 순차적으로 읽었을 때와 역순으로 읽었을 때 같은 문자열을 의미한다.
		 * 본 프로그램이 동작하도록 Palindrome() 메소드를 작성하여라.
		 * 단, String 클래스의 charAt() 외에 equals() 등과 같은 문자열 비교 관련 메소드 사용 금지.
		 */
		
		String inputStr = "";
				
		do {		

			System.out.print("Enter the string : ");
			Scanner sc = new Scanner(System.in);
			inputStr = sc.next();
			
			if(Palindrome(inputStr)) {
				System.out.println(inputStr + " is palindrome");
			}
			else {
				System.out.println(inputStr + " is not palindrome");
				
			}
		} while(!inputStr.equals("z"));		
		
	}

}
