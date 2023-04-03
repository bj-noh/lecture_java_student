package Chap4_Practice;
import java.util.Scanner;

public class _02_ArrayPlusConstant {
	
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
    	 * 2차원 matrix의 크기와 각 element, 더할 상수는 사용자가 입력받도록 이미 구현되어 있다. 
    	 *  
    	 * 1) 본 프로그램이 정상적으로 작동할 수 있도록 addConstant()를 작성하고,
    	 * 2) 결과 matrix를 출력 예시처럼 출력할 수 있도록 printMatrix()를 작성하라.
    	 *
    	 * 예시)
    	 * 	       >> input
		 * 		   Enter the number of rows: 3
			   	   Enter the number of columns: 4
				   Enter element [0][0]: 1
				   Enter element [0][1]: 2
				   Enter element [0][2]: 3
				   Enter element [0][3]: 4
				   Enter element [1][0]: 5
				   Enter element [1][1]: 6
				   Enter element [1][2]: 7
				   Enter element [1][3]: 8
				   Enter element [2][0]: 9
				   Enter element [2][1]: 10
				   Enter element [2][2]: 11
				   Enter element [2][3]: 12
				   Enter the constant to add: 100
				   
				   >> output
				   Result:
				   101 102 103 104 
				   105 106 107 108 
				   109 110 111 112 
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
