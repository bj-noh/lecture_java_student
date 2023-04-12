package Chap5_Practice;

import java.util.Scanner;

public class _03_StringSorting_answer {
	
	public static void stringSorting(String[] strArray) {
	    int n = strArray.length;

	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (strArray[j].compareTo(strArray[j + 1]) > 0) {
	                String temp = strArray[j];
	                strArray[j] = strArray[j + 1];
	                strArray[j + 1] = temp;
	            }
	        }
	    }
	}
	
	public static void printString(String[] strArray) {
		for (String str : strArray) {
			System.out.println(str + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 본 프로그램은 문자열을 공백단위로 입력받고, 그 결과를 abc 오름차순으로 정렬하여 출력하는 프로그램이다.
		 * 본 프로그램이 정상적으로 동작하도록 stringSort()와 printString() 메소드 작성하여라.
		 * stringSort()은 문자열 배열을 정렬하는 메소드이고, printString()은 정렬된 문자열을 출력하는 메소드이다.
		 * 단, Sorting 방법은 bubble sort와 selection sort 방법 중에서 활용한다.		
		 */
		
		Boolean inputOption = false; // inputOption이 true인 경우 내가 직접 입력 받음.
		String[] strArray;
		
		if(inputOption) {
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the string with space: ");
	        String strInput = scanner.nextLine();
	        strArray = strInput.split(" ");
		}
		else {
			strArray = new String[] {"apple", "yolo", "mango", "bingo", "test", "testtest"};
		}
        
		stringSorting(strArray);
		printString(strArray);
	}

}
