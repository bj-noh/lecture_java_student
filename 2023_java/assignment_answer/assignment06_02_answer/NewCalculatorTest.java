package assignment06_02_answer;

import java.util.Scanner;

public class NewCalculatorTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
    	 * 본 프로그램은 수식을 입력받고, 그 결과를 출력해주는 계산기 프로그램이다.
    	 * Chap6_Practice_01의 프로그램과 다르게, 본 프로그램은 수식을 한번에 입력받는다. (e.g. 5+4, 16*17, etc.)
    	 * 
    	 * 아래 소스 코드가 잘 작동하도록 NewCalculator 클래스 내에 메소드들을 구현하세요.
    	 * 
    	 * 예시)
    	 * 	Enter the expression (e.g., 5+3): 8*9
			Result = 72.0
			
			Enter the expression (e.g., 5+3): 17/19
			Result = 0.8947368421052632
    	 * 
    	 */
		
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the expression (e.g., 5+3): ");
        String input = scanner.nextLine();        

        NewCalculator newCal = new NewCalculator(input);
        
        double firstNumber = newCal.getFirstNumber();
        double secondNumber = newCal.getSecondNumber();
        char operation  = newCal.getOperation();
                
        double result;
        
        switch (operation) {
        case '+':
            result = newCal.add(firstNumber, secondNumber);
            break;
        case '-':
            result = newCal.subtract(firstNumber, secondNumber);
            break;
        case '*':
            result = newCal.multiply(firstNumber, secondNumber);
            break;
        case '/':
            if (secondNumber == 0) {
                System.out.println("Division by zero is not allowed.");
                return;
            }
            result = newCal.divide(firstNumber, secondNumber);
            break;
        default:
            System.out.println("Invalid operation. Program off.");
            return;
        }
        
        System.out.println("Result = " + result);
        
	}
}
