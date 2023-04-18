package midterm_exam;

public class Num28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0, 1, 2, 3}, 
						  {3, 4, 5}, 
						  {6, 7, 8, 9, 10}};

		for (int i = 0; i < matrix.length; i++) { 
			for (int j = 0; j < matrix[i].length; j++) {
					if (j % 3 != 0) {
						System.out.print(matrix[i][j]);
					}
			} 
		}
	}
}
