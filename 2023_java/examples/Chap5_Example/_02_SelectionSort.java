package Chap5_Example;

public class _02_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8, 54, 99, 3, 2, 1, 0};
        final int length = arr.length;
		
		System.out.print("Origin array: ");

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		int n = arr.length;

	    for (int i = 0; i < n - 1; i++) {
	        // Find the index of the minimum element in the unsorted part of the array
	        int minIdx = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[minIdx]) {
	                minIdx = j;
	            }
	        }

	        // Swap the minimum element with the first element in the unsorted part of the array
	        int temp = arr[i];
	        arr[i] = arr[minIdx];
	        arr[minIdx] = temp;
	        
            // 과정 출력
            System.out.print((i+1)+"th proc: ");
            for(int x : arr)
            	System.out.print(x+" ");
            System.out.println();
	    }
	    
	}
}
