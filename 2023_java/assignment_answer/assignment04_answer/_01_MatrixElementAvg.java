package assignment04_answer;
import java.util.Scanner;

public class _01_MatrixElementAvg {
	
	public static void MatrixElementAvg(int[][] arr) {
		
		int count = 0;
		double totalAvg = 0;

        for (int i = 0; i < arr.length; i++) {

    		double partialAvg = 0;
    		
            for (int j = 0; j < arr[i].length; j++) {
            	partialAvg += arr[i][j];
                count++;
            }
            
            totalAvg += partialAvg;
            
            System.out.println("Average of row " + i + ": " + partialAvg / arr[i].length);
        }
        
        System.out.println("Average of 2D matrix : " + totalAvg / count);
		
	}

    public static void main(String[] args) {
    	/*
    	 * 본 프로그램은 2차원 matrix의 row와 column 길이와 각 matrix의 element를 입력받은 후
    	 * 각 row의 평균과 matrix 전체 element의 평균을 출력하는 프로그램이다.
    	 * 2차원 matrix의 크기와 각 element의 초기화는 사용자가 입력받도록 이미 구현되어 있다.
    	 * 본 프로그램이 작동하도록 MatrixElementAvg() 메소드를 완성하라.
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
				   
				   >> output
				   Average of row 0: 2.5
				   Average of row 1: 6.5
				   Average of row 2: 10.5
				   Average of 2D matrix : 6.5
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
        
        MatrixElementAvg(arr);
    }
}
