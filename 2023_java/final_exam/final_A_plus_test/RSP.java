package final_A_plus_test;

import java.util.Random;
import java.util.Scanner;

public class RSP {
    private static final int ROCK = 0;
    private static final int SCISSORS = 1;
    private static final int PAPER = 2;
    
    public int computer;
    
    public RSP() { // 생성자가 생성될 때마다 computer의 값이 바뀜
        Random rand = new Random();
        computer = rand.nextInt(3);
    }
    
    public int determineResult(int user) {
    	/*
    	 * 비긴경우: 0을 리턴
    	 * 이긴경우: 1을 리턴
    	 * 진 경우: -1을 리턴
    	 */
    	// CODE HERE
    }
    
    public String ShowInfo(int number) { // 파라미터의 값이 0이면 rock, 1이면 scissors, 2이면 paper를 출력해주는 메소드 (main()에서 활용해야 함) 
    	if (number < 0 || number > 2) return "N/A";
    	else if(number == ROCK) return "Rock";
    	else if(number == SCISSORS) return "Scissors";
    	else return "Paper";
    }
    
}
