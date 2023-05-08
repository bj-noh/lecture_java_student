package Chap3_Practice01_InClass_answer;
import java.util.Scanner;

public class _01_NumberMultipleWhile {
    public static void main(String[] args) {
    	/*
		 * 정수 하나(num)를 입력받고 1부터 num까지 곱한 결과를 출력하는 프로그램을 작성하라. 
		 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int total = 1;

        int i = 1;
        while (i <= num) {
        	total *= i;
        	i++;
        }
        
        System.out.println("The result from 1 to " + num + " is " + total);
    }
}
