package Chap2_Example;

public class _01_Operator1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 산술 연산자
    	int num1 = 100;
    	int num2 = 200;
    	int result = num1 + num2;
    	
    	System.out.println(result);
    	System.out.println(result / 10);
    	System.out.println(result % 10);
    	
        // 괄호를 이용한 우선 순위
        System.out.println(27 - 7 * 2); 
        System.out.println((27 - 7) * 2); 
        System.out.println(27 - (7 * 2));

        // 증감 연산 ++, --
        int val;
        val = 5;
        System.out.println(val); 
        System.out.println(++val); 
        System.out.println(val); 

        val = 10;
        System.out.println(val); 
        System.out.println(val++); 
        System.out.println(val); 

        val = 10;
        System.out.println(val); 
        System.out.println(--val); 
        System.out.println(val); 

        val = 10;
        System.out.println(val); 
        System.out.println(val--); 
        System.out.println(val); 
        
        val = 10;
        System.out.println(val++); 
        System.out.println(val++); 
        System.out.println(val++); 
        System.out.println(val); 
        
        val = 10;
        System.out.println(val++ + 100); 
        System.out.println(val); 
        System.out.println(++val + 200); 
        System.out.println(val); 
    }
}
