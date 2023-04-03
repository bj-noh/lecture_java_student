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
		
        for (int i = 0; i < length; i++) {	
            for (int j = i + 1; j <arr.length; j++) {	
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            
            // 과정 출력
            System.out.print((i+1)+"th proc: ");
            for(int x : arr)
            	System.out.print(x+" ");
            System.out.println();
        }	        
	}

}
