package Chap4_Example;

public class _05_Array2DForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array2D = { {79, 80, 81}, 
							{83, 65, 90}, 
							{80, 92, 100}, 
							{100, 92, 98} };
		
		for (int[] innerArray : array2D) {
			for (int ele : innerArray) {
				System.out.println(ele);
			}
		}
	}
}
