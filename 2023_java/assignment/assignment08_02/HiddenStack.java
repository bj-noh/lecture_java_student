package assignment08_02;

public class HiddenStack {
			
	public static void main(String[] args) {
		/* 
		 * 본 프로그램은 정수 배열(arr)이 주어지고, arr을 이용하여 조건에 따라 새로운 배열 newArr을 만드는 프로그램이다.
		 * 조건은 다음과 같다.
		 * 1. cap은 초기 arr의 크기이며, index는 0부터 cap-1까지 반복된다. 
		 * 2. 만약 newArr가 빈 배열이라면, arr[index]의 값을 newArr에 추가하고 index에 1을 더한다.
		 * 3. newArr에 원소가 있고, newArr의 마지막 원소의 값이 arr[index]의 값보다 작으면 arr[index]를 newArr의 뒤에 추가하고 index에 1을 더한다.
		 * 4. newArr에 원소가 있고, newArr의 마지막 원소의 값이 arr[index]보다 크거나 같으면 newArr의 마지막 원소를 newArr에서 제거하고, index의 값은 증가시키지 않는다.
		 * 5. 반복이 끝났다면, 그 값을 result 배열에 넣고, 최종 결과를 출력한다 (구현 완료)
		  
 		 * 예시)
 		 * 
			arr	                  result
			{1, 4, 2, 5, 3}	     {1, 2, 3}
			
		* 예시 설명) arr = {1, 4, 2, 5, 3}, cap = 4
		* 
			i	 arr[i]	    stk
			0	  1	       	{1}
			1	  4		   	{1, 4}
			2	  2			{1}
			2	  2	 		{1, 2}
			3	  5			{1, 2, 5}
			4	  3			{1, 2}
			4	  3			{1, 2, 3}
		*/
		
		//int[] arr = {1, 4, 2, 5, 3, 5, 5, 3, 2, 1, 2, 3, 4, 4, 3, 1, 1, 2};
		int[] arr = {1, 4, 2, 5, 3};
		int cap = arr.length;
        int[] newArr = new int[cap];
        int top = -1;
        int index = 0;

	    /////////////// CODE HERE ///////////////
	    
	    /////////////////////////////////////////
        
        
        int[] result = new int[top + 1];
        for (int j = 0; j <= top; j++) {
        	result[j] = newArr[j];
        }
        
        for (int i = 0; i < result.length; i++) {
        	System.out.print(newArr[i] + " ");
        }			
	} 
}
