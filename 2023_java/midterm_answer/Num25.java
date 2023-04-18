package midterm_exam;

public class Num25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1000;
		int num2 = 205;
		int num3 = 200;
		
		int biggestNum = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : (num2 > num3) ? num2 : num3;
		
		System.out.println(biggestNum);


	}

}
