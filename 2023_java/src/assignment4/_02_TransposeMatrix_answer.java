package assignment4;

public class _02_TransposeMatrix_answer {
	
	public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
		
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 본 프로그램은 3x3 크기의 matrix를 정수로 구성된 2차원 array로 표현하고 그 matrix의 transpose를 계산 및 출력 프로그램이다. 
		 * 본 프로그램이 작동하도록 함수 transpose()와 printMatrix()를 구현하시오.
		 * 
		 * Matrix A는 3x3 크기이며, 그 transpose는 다음과 같다.
		 * 
		 *      A		   transposed A
		 *   1  2  3         1  4  7
		 *   4  5  6  == >>  2  5  8
		 *   7  8  9         3  6  9
		 * 
		 */
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
        int[][] transposedMatrix = transpose(matrix);
        printMatrix(transposedMatrix);
    }   
}