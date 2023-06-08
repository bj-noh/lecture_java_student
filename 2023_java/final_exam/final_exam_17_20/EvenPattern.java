package final_exam_17_20;

public class EvenPattern extends Pattern {

	public EvenPattern(String pattern) {
		super(pattern);
	}
	
	public void TriPattern() {
		int cnt = 1;

	    for (int i = 0; i < num; i++) {
	        for (int j = 0; j <= i; j++) {
	        	if (cnt % 2 == 0) {
	        		patternMatrix[i][j] = cnt++;
	        	}
	        }
	    }
	}
}
