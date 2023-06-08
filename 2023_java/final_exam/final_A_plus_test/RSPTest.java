package final_A_plus_test;

import java.util.Scanner;

public class RSPTest {
    public static void main(String[] args) {
    	/*
         * 본 프로그램은 컴퓨터와 유저가 가위바위보를 해서 승패를 가리는 게임이다.
         * 
         * 바위(Rock)는 0, 가위(Scissors)는 1, 보(Paper)는 2이다.
         * 
         * 컴퓨터는 RSP 객체를 생성하며 0, 1, 2 중 하나의 랜덤값을 생성한다. 
         * 유저는 값을 0, 1, 2 중 하나의 값을 입력받고, 그 값을 비교하며 승-패를 가린다.
         * 일반적인 가위바위보의 룰은 다음과 같다.
         * 		1) 가위 vs 바위 => 바위 승
         * 		2) 가위 vs 보 => 가위 승
         * 		30 보 vs 바위 => 보 승
         * 
         * 본 프로그램은 한 판의 가위바위보가 끝난 후 사용자가 "yes"를 입력하면 무한히 계속 할 수 있고, 그렇지 않은 경우 프로그램은 종료된다.
         * 다만, user의 값이 0보다 작거나 2보다 큰 경우 => "Invalid move. Please try again."을 출력 후 계속 게임을 즐길 수 있으며, 
         * 새로운 게임에서는 computer의 값은 계속해서 바뀐다. (안바뀔수도있음)
         * 유저가 값을 입력 후 컴퓨터의 입력값을 함께 보여준다. (출력 예시 참조)
         * 
         * 본 프로그램이 정상적으로 작동하도록 RSP.java와 RSPTest.java를 구현하라.
         * 
         * 아래는 본 프로그램을 동작하였을 때의 출력 예시이다.
         * 
         * 출력 예시)
         * 	Enter your move (0 for rock, 1 for scissors, 2 for paper): 2
			Computer chooses: Paper
			Result: It's a draw!
			Play again? (yes/no): yes
			Enter your move (0 for rock, 1 for scissors, 2 for paper): 1
			Computer chooses: Paper
			Result: You win!
			Play again? (yes/no): yes
			Enter your move (0 for rock, 1 for scissors, 2 for paper): 100
			Invalid move. Please try again.
			Enter your move (0 for rock, 1 for scissors, 2 for paper): 0
			Computer chooses: Paper
			Result: You lose!
			Play again? (yes/no): yes
			Enter your move (0 for rock, 1 for scissors, 2 for paper): 0
			Computer chooses: Paper
			Result: You lose!
			Play again? (yes/no): yes
			Enter your move (0 for rock, 1 for scissors, 2 for paper): 0
			Computer chooses: Scissors
			Result: You win!
			Play again? (yes/no): no
			Thank you for playing!
         */
    	
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	// CODE HERE
        }

        System.out.println("Thank you for playing!");
        scanner.close();        
    }
}
