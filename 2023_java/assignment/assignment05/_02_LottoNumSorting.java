package assignment05;
import java.util.Random;

public class _02_LottoNumSorting {
	
	public static int[] lottoNumGenerator(int num) {
		int[] lotto = new int[6];

		outer : for(int i = 0; i < lotto.length;) {
		lotto[i] = new Random().nextInt(45) + 1; //1 ~ 45사이의 난수를 발생
		
		for(int j = 0; j < i; j++) {
			if(lotto[i] == lotto[j]) {
				continue outer;
			}
		}
		
		i++;
		
		}
		return lotto;
	}
	
	public static void numSorting(int[] nums) {

        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 본 프로그램은 Lotto 번호 1~45의 정수 6개를 중복없이 발생시키고 정렬하여 출력하는 프로그램이다.
		 * LottoNumGenerator()은 1~45의 정수 6개를 중복없이 랜덤으로 발생시키는 메소드이다.
		 * NumSorting()을 작성하여 발생된 6개의 정수를 정렬하는 메소드를 구현하여라.
		 */
		
		int[] lottoNums = lottoNumGenerator(6);
		
		for (int num : lottoNums) {
			System.out.println(num);
		}		
		
		numSorting(lottoNums);
				
		for (int num : lottoNums) {
			System.out.println(num);
		}

	}

}
