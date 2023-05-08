package Chap5_Example;

public class _01_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8, 54, 99, 3, 2, 1, 0};
        final int length = arr.length;
		
		System.out.print("Origin array: ");

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		
        for (int i = 0; i < length - 1; i++) {	// 배열의 길이만큼 도는데
            for (int j = 0; j < length - i -1; j++) {	// 0 ~ size -1까지
                if (arr[j] > arr[j + 1]) {	// 인접한 애들끼리 계속 비교하면서 자리교체
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
