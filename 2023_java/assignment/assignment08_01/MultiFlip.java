package assignment08_01;

public class MultiFlip {

    public static String multiFlips(String str, int[][] queries) {
    	

        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    	
    }
    
    public static void main(String[] args) {
    	
		/*
		 * 본 프로그램은 주어진 문자열에 대해 이차원 정수 배열 queries의 조건에 따라 조작하는 프로그램이다.
		 * 문자열 조작법은 다음과 같다.
		 * 1. queries의 내에는 {s, e} 형태의 일련의 query가 원소들로 주어진다.
		 * 2. 주어진 문자열의 인덱스 s부터 인덱스 e까지를 뒤집는다.
		 * 3. queries의 모든 query를 순차적으로 수행한다.
		 * 
		 * 조건에 맞게 작동하도록 mutlFlips() 메소드를 완성하여라.
		 */
    	
    	int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
    	String result = multiFlips("rermgorpsam", queries);
    	System.out.println(result);
    }

}
