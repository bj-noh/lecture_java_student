package assignment08_03;

public class PixelsUp {
	public static String[] K_Pixels(String[] picture, int k) {

	    /////////////// CODE HERE ///////////////
	    
	    /////////////////////////////////////////
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음은 주어진 이미지의 픽셀을 N배 확대시켜서 출력하는 프로그램이다.
		 * 
		 * 이미지는 직사각형 형태로 존재하며, 1x1 크기의 정사각형 픽셀로 구성된다.
		 * 아래와 같은 그림 파일은 string array의 형태로 다음과 같이 나타낼 수 있다.
		 *  .xx...xx.
			x..x.x..x
			x...x...x
			.x.....x.
			..x...x..
			...x.x...
			....x....
			String[] input = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
			
			본 그림 파일을 가로/세로로 각각 N배 확대시키면 다음 그림과 같다. N을 입력받고 다음과 같은 결과를 출력해라.
			
			..xxxx......xxxx..
			..xxxx......xxxx..
			xx....xx..xx....xx
			xx....xx..xx....xx
			xx......xx......xx
			xx......xx......xx
			..xx..........xx..
			..xx..........xx..
			....xx......xx....
			....xx......xx....
			......xx..xx......
			......xx..xx......
			........xx........
			........xx........
		 */
		
		String[] input = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		String[] output = K_Pixels(input, 2);
		

		for (int i = 0; i <input.length; i++) {
			System.out.println(input[i]);
		}
		
		for (int i = 0; i <output.length; i++) {
			System.out.println(output[i]);
		}
		
		String[] input2 = {"x.x", ".x.", "x.x"};
		String[] output2 = K_Pixels(input2, 3);
		

		for (int i = 0; i <input2.length; i++) {
			System.out.println(input2[i]);
		}
		
		for (int i = 0; i <output2.length; i++) {
			System.out.println(output2[i]);
		}
		
	}

}
