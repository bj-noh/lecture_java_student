package assignment06_01;

import java.util.Scanner;

public class SpiralPattern {
	
    private static void printMatrix(int[][] matrix) {
    	/////////////// CODE HERE ///////////////
        
    	/////////////////////////////////////////
    }
    
    public static void main(String[] args) {
    	
    	/*
    	 * 아래와 같이 inputNumber를 입력받고, inputNumber * inputNumber크기의 정사각 matrix의 숫자를 달팽이 모양으로 채우고 출력하는 코드를 작성하세요.
    	 * 
    	 * 
    	 * Enter the input number: 5
			1	2	3	4	5	
			16	17	18	19	6	
			15	24	25	20	7	
			14	23	22	21	8	
			13	12	11	10	9
    	 */
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        int inputNumber = scanner.nextInt();

        int[][] spiral = new int[inputNumber][inputNumber];

        int value = 1;
        int minRow = 0, maxRow = inputNumber - 1;
        int minCol = 0, maxCol = inputNumber - 1;
        
		/////////////// CODE HERE ///////////////
		        
		/////////////////////////////////////////
        
        printMatrix(spiral);
    }

}
