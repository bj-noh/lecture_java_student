package assignment04;
import java.util.Scanner;

public class _03_ArrayPlusConstant2 {
	
	public static void addConstant(int[][] arr, int constant) {

        /////////////// CODE HERE ///////////////

        /////////////////////////////////////////
    }

    public static void printMatrix(int[][] arr) {
    	
        /////////////// CODE HERE ///////////////

        /////////////////////////////////////////
    }

	public static void main(String[] args) {
		/*
    	 * 본 프로그램은 2차원 matrix에서 각 element에 상수를 더한 결과를 출력하는 프로그램이다.
    	 * 단, 아래 세 가지 조건을 만족한 연산을 수행해야 한다.
    	 * 1) 해당 element의 값이 0이면 상수를 더하지 않는다.
    	 * 2) 그러나 모든 element의 값이 0인 경우에는 상수를 더한다.
    	 * 3) 해당 element의 값이 음수인 경우는 절댓값을 취한다.
    	 * 
    	 * 2차원 matrix의 크기와 각 element, 더할 상수는 사용자가 입력받도록 이미 구현되어 있다.
    	 *  
    	 * 1) 본 프로그램이 정상적으로 작동할 수 있도록 addConstant()를 작성하고,
    	 * 2) 결과 matrix를 출력 예시처럼 출력할 수 있도록 printMatrix()를 작성하라.
    	 *
    	 * 예시 1)
    	 * 	       >> input
		 * 		   Enter the number of rows: 3
				   Enter the number of columns: 3
				   Enter element [0][0]: 1
				   Enter element [0][1]: 2
				   Enter element [0][2]: 0
				   Enter element [1][0]: 3
				   Enter element [1][1]: 4
				   Enter element [1][2]: -5
				   Enter element [2][0]: 6
				   Enter element [2][1]: 0
				   Enter element [2][2]: 1
				   Enter the constant to add: 5
				   
				   >> output
				   Result:
				   6 7 0 
				   8 9 5 
				   11 0 6
				   
		 * 예시 2)
		 *         >> input
				   Enter the number of rows: 2
				   Enter the number of columns: 2
				   Enter element [0][0]: 0
 				   Enter element [0][1]: 0
				   Enter element [1][0]: 0
				   Enter element [1][1]: 0
				   Enter the constant to add: 500
				   
				   >> output
				   Result:
				   500 500 
				   500 500 

    	 * 
    	 */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.print("Enter the constant to add: ");
        int constant = input.nextInt();

        input.close();
        
        addConstant(arr, constant);
        printMatrix(arr);
    }
}
