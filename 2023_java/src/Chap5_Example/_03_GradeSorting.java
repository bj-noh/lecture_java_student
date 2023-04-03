package Chap5_Example;
import java.util.Scanner;

public class _03_GradeSorting {
	
	public static int[] gradeSortingReturn(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }		
        return arr;
	}
	
	public static void gradeSorting(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }		
	}
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // int[] grades = new int[n];
        int[] grades = {10, 50, 71, 23, 13, 72, 99, 100, 14, 67, 42};
        int len = grades.length;        
       
        gradeSorting(grades);
        
        System.out.println("Sorted grades:");
        for (int i = 0; i < len; i++) {
            System.out.println(grades[i]);
        }      
        int[] newGrades = gradeSortingReturn(grades);  
	}
	
	
}
