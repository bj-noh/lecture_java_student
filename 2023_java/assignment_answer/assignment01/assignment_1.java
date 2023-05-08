package assignment01;

public class assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int year = 2023;
		int sizeOfDouble = Double.BYTES;
		int sizeOfInt = Integer.BYTES;
		int fourBitNums = 16;
		int eightBytesBit = 64;
		int num2 = -10;
		int num3 = 15;
		
		int result = num1 + year - sizeOfDouble + sizeOfInt +
				fourBitNums +  eightBytesBit - num2 + num3;
		
		System.out.println("The result is " + result);
	}

}
