package midterm_exam;

public class Num1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. O
		//    JVM == Java Virtual Machine O
		
		// 2. X
		//    (3A1)_16 => 1110100001
		
		// 3. O
		int ch1 = 'c';
		int ch2 = ch1 + 1;		
		System.out.println("'c' =" + ch1 + ", 'c'+1 =" + ch2);
		
		// 4. O
		//    십진수 5의 이진수변환: 00000101 => 1의 보수: 11111010 => 2의 보수: 11111011 (-5) 
		
		// 5. X 
		//    k * a * (b - 4 * a* c) / (51 * x)
		
		// 6. O
		
		// 7. X
		//    (20 <= age) && (age < 30)
		
		// 8. O
		
		// 9. O
		
		// 10. X
		
		// 11. X
		System.out.println(72%11);
		
		// 12. X
		byte a = (byte) 101101;
		byte b = (byte) 110001;
		byte c = (byte) ((a & b) << 1);
		System.out.println(Integer.toBinaryString(c)); // 100001
	}

}
