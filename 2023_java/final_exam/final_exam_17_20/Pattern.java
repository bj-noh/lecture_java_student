package final_exam_17_20;

public class Pattern implements PatternInterface {
	
	protected int[][] patternMatrix;
	
	public Pattern(String pattern) {
		this.patternMatrix = new int[num][num];
		
		if (pattern.equals("rectangle")) {
			RectPattern();
		}
		else if (pattern.equals("triangle")) {
			TriPattern();
		}
	}	

	public void RectPattern() {
		int cnt = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				patternMatrix[i][j] = cnt++;
			}
		}
	}

	public void TriPattern() {
		int cnt = 1;

	    for (int i = 0; i < num; i++) {
	        for (int j = 0; j <= i; j++) {
	        	this.patternMatrix[i][j] = cnt++;
	        	System.out.println(this.patternMatrix[i][j]);
	        }
	    }
	}
	
	public void PatternSizeUp(int k) {
		this.patternMatrix = new int[num * k][num * k];

        int value = 1;
        for (int i = 0; i < num * k; i += k) {
            for (int j = 0; j < num * k; j += k) {
                for (int x = 0; x < k; x++) {
                    for (int y = 0; y < k; y++) {
                    	this.patternMatrix[i + x][j + y] = value++;
                    }
                }
            }
        }		
	}
	
	public void Printer() {
        for (int[] row : this.patternMatrix) {
            for (int elem : row) {
            	if (elem == 0) {
            		continue;
            	}
                System.out.print(elem + "\t");
            }
            System.out.println();
        }		
	}
}
