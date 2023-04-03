package Chap4_Example;

public class _01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//크기 할당 & 초기화 없이 배열 참조변수만 선언
		int[] arr1;
		int arr2[];

		// 선언과 동시에 배열 크기 할당
		int[] arr3 = new int[5];
		String[] arr4 = new String[5]; 

		// 기존 배열의 참조 변수에 초기화 할당하기
		int[] arr5;
		arr5 = new int[5]; //5의 크기를 가지고 초기값 0으로 채워진 배열 생성

		// 선언과 동시에 배열의 크기 지정 및 값 초기화
		int[] arr6 = {1,2,3,4,5}; 
		int[] arr7 = new int[]  {1,3,5,2,4};    
		int[] odds = {1,3,5,7,9};  
		String[] weeks = {"월","화","수","목","금","토","일"};

		// 2차원 배열 선언
		int[][] arr9 = new int[4][3];   //3의 크기의 배열을 4개 가질 수 있는 2차원 배열 할당  
		int[][] arr10 = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {3, 4, 5}};
		//arr10[0] >> {2, 5, 3};
		//arr10[1] >> {4, 4, 1};
		//arr10[2] >> {1, 7, 3};
		//arr10[3] >> {3, 4, 5};
		
		
	}

}
