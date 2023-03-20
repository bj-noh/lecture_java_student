package Chap2_Example;

public class _02_Operator2 {
	public static void main(String[] args) {
		
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		// 비트연산
		System.out.println("[비트연산결과]");
		System.out.printf("%04x\n", (short)a & b); // 비트 AND
		System.out.printf("%04x\n", (short)a | b); // 비트 OR
		System.out.printf("%04x\n", (short)a ^ b); // 비트 XOR
		System.out.printf("%04x\n", (short)~a); // 비트 NOT
				
		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		
		// 시프트연산
		System.out.println("[시프트연산결과]");
		System.out.println(c << 2); // c를 2비트왼쪽시프트
		System.out.println(c >> 2); // c를 2비트오른쪽시프트. 양수이므로 0 삽입
		System.out.println(d >> 2); // d를 2비트오른쪽시프트. 음수이므로 1 삽입
		System.out.printf("%x\n", (d >>> 2)); // d를 2비트오른쪽시프트. 0 삽입
	}
}