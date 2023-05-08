package assignment06_03;

import java.util.Scanner;

public class UpAndDownGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 본 프로그램은 up and down으로 숫자를 추측하는 게임프로그램이다.
		 * 본 프로그램이 정상적으로 작동할 수 있도록 UpAndDownGame 클래스와 main 메소드 내부 로직을 구현하라.
		 * 
		 * 예시)
		 *	Welcome to the Up and Down game!
			I'm thinking of a number between 1 and 100.
			Can you guess the number?
			Enter your guess: 50
			Up! The number is higher.
			Enter your guess: 80
			Down! The number is lower.
			Enter your guess: 70
			Down! The number is lower.
			Enter your guess: 60
			Down! The number is lower.
			Enter your guess: 55
			Down! The number is lower.
			Enter your guess: 53
			Congratulations! You guessed the number in 6 tries.
		 * 
		 */		

        Scanner scanner = new Scanner(System.in);
        UpAndDownGame game = new UpAndDownGame(1, 100);

        System.out.println("Welcome to the Up and Down game!");
        System.out.println("I'm thinking of a number between " + game.getLowerBound() + " and " + game.getUpperBound() + ".");
        System.out.println("Can you guess the number?");

        boolean isCorrect = false;
        int numberOfTries = 0;

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();            

    	    /////////////// CODE HERE ///////////////
    	    
    	    /////////////////////////////////////////
            
        }

        System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");


	}

}
