package final_exam_17_20;

public class SpiralPattern extends Pattern {	
	public SpiralPattern(String pattern) {
		super(pattern);		
	}

	public void RectPattern() {
		this.patternMatrix = new int[num][num];

        int value = 1;
        int minRow = 0, maxRow = num - 1;
        int minCol = 0, maxCol = num - 1;

        while (value <= num * num) {
            for (int i = minCol; i <= maxCol; i++) {
            	this.patternMatrix[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
            	this.patternMatrix[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
            	this.patternMatrix[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
            	this.patternMatrix[i][minCol] = value;
                value++;
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
	}
}
