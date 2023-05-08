package Chap4_Example;

public class _09_ArrayArgument {

	public static void addNums(int[] arr) {
		int sum = 0;
		
		for (int ele : arr) {			
			sum += ele;			
		}
		
		System.out.println(sum);
	}
	
	public static void addNums(int[][] arr2D) {
		int sum = 0;
		
		for (int inner[] : arr2D) {
			for (int ele : inner) {
				sum += ele;
			}
		}

		System.out.println(sum);
	}
	
	public static void addNumsVariableLength(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 10}};
		
		addNums(arr);
		addNums(arr2D);
		addNumsVariableLength(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		addNumsVariableLength(1, 2, 3);
				
	}

}
