package assignment06_03_answer;

import java.util.Random;

public class UpAndDownGame {
    private int lowerBound;
    private int upperBound;
    private int target;

    public UpAndDownGame(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.target = generateRandomNumber(lowerBound, upperBound);
    }

    private int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getTarget() {
        return target;
    }
}
