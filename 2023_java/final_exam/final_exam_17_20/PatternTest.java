package final_exam_17_20;

// 17 interface
// 18 interface
// 19 algorithm 
// 20 algorithm

public class PatternTest {

	public static void main(String[] args) {
		
		// Num 17 O
		Pattern RectPattern1 = new Pattern("rectangle");
		RectPattern1.Printer();

		System.out.println();
		// Num 18 X
		Pattern EvenTriPattern = new EvenPattern("triangle");
		EvenTriPattern.Printer();
		
		System.out.println();
				
		// Num 19 X
		SpiralPattern pattern = new SpiralPattern("rectangle");
		pattern.Printer();

		System.out.println();
		
		// Num 20 O
		Pattern RectPattern2 = new Pattern("rectangle");
		RectPattern2.PatternSizeUp(2);
		RectPattern2.Printer();		
		

	}
}
