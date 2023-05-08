package Chap3_Practice01_InClass_answer;

public class _02_ThreeMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1부터 100까지의 정수 중 3의 배수만을 출력하세요.
		 */
		
		for(int i = 1; i*3 <= 100; i++) {
		    System.out.println(i*3);
		}

		for(int i = 1; i <= 100; i++) {
		    if(i%3==0) {
		        System.out.println(i+"은 3의 배수 입니다.");
		    
		    }
		}
	}
}
