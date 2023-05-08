package Chap4_Practice01_InClass_answer;
import java.util.Scanner;

public class _01_MatrixElementSum {
	
	public static void MatrixElementSum(int[][] arr) {

		int count = 0;
		int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {

    		int partialSum = 0;
    		
            for (int j = 0; j < arr[i].length; j++) {
            	partialSum += arr[i][j];
                count++;
            }
            
            totalSum += partialSum;
            
            System.out.println("Sum of row " + i + ": " + partialSum);
        }
        
        System.out.println("Sum of 2D matrix : " + totalSum);
		
	}

    public static void main(String[] args) {
    	/*
    	 * 본 프로그램은 2차원 matrix의 row와 column 길이와 각 matrix의 element를 입력받은 후
    	 * 각 row의 합과 matrix 전체 element의 합을 출력하는 프로그램이다.
    	 * 2차원 matrix의 크기와 각 element의 초기화는 사용자가 입력받도록 이미 구현되어 있다.
    	 * 본 프로그램이 예시처럼 작동하도록 MatrixElementSum() 메소드를 완성하라.
    	 * 
    	 * 예시)
    	 * 	       >> input
		 * 		   Enter the number of rows: 3
			       Enter the number of columns: 2
				   Enter element [0][0]: 1
				   Enter element [0][1]: 2
				   Enter element [1][0]: 3
				   Enter element [1][1]: 4
				   Enter element [2][0]: 5
				   Enter element [2][1]: 6
				   
				   >> output
 				   Sum of row 0: 3
   				   Sum of row 1: 7
				   Sum of row 2: 11
				   Sum of 2D matrix : 21
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
        
        MatrixElementSum(arr);
    }
}
