package assignment06_03;

import java.util.Random;

public class UpAndDownGame {
    private int lowerBound;
    private int upperBound;
    private int target;

    public UpAndDownGame(int lowerBound, int upperBound) {
    	
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    	
        this.target = generateRandomNumber(lowerBound, upperBound);
    }

    private int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
    

	// getLowerBound(), getUpperBound(), getTarget() 메소드를 구현하는 부분
    /////////////// CODE HERE ///////////////
    
    /////////////////////////////////////////
    
}
