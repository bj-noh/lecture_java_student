package Chap6_Example_06;
import java.util.Scanner;

import assignment6_02.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
    	
    	/*
    	 * 본 프로그램은 첫번째 숫자 (first), 두번째 숫자 (second), 연산자(operation (+, -, *, /))를 입력받아 그 결과를 출력해주는 계산기 프로그램이다.
    	 * 본 프로그램은 연산자에 +, -, *, / 외에 다른 문자가 입력되면 종료된다.
    	 * 아래 소스 코드가 잘 작동하도록 Calculator 클래스 내에 add(), subtract(), multiply(), divide() 메소드를 구현하세요.
    	 * 
    	 * 예시)
    	 *  Enter the first number: 5
			Enter the second number: 10
			Enter the operation (+, -, *, /): +
			Result: 15.0
			Enter the operation (+, -, *, /): /
			Result: 0.04878048780487805
			Enter the first number: 15
			Enter the second number: 17
			Enter the operation (+, -, *, /): *
			Result: 255.0
			Enter the first number: 7
			Enter the second number: -45
			Enter the operation (+, -, *, /): 0
			Invalid operation. Program off.
    	 * 
    	 */
    	
    	while(true) {
            Scanner scanner = new Scanner(System.in);
            Calculator operations = new Calculator();

            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.print("Enter the operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            
            double result;

            switch (operation) {
                case '+':
                    result = operations.add(firstNumber, secondNumber);
                    break;
                case '-':
                    result = operations.subtract(firstNumber, secondNumber);
                    break;
                case '*':
                    result = operations.multiply(firstNumber, secondNumber);
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("Division by zero is not allowed.");
                        return;
                    }
                    result = operations.divide(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("Invalid operation. Program off.");
                    return;
            }

            System.out.println("Result: " + result);
    	}    	
    }
}
