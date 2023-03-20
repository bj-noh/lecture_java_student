package Chap2_Example;

public class _05_Operator5 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 논리 연산자
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;

        System.out.println(b1 || b2 || b3); 
        System.out.println(b1 && b2 && b3); 

        // And 연산
        System.out.println((10 > 3) && (10 > 7)); 
        System.out.println((10 > 3) && (10 < 15)); 

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); 
        System.out.println((5 > 3) || (3 < 1)); 
        System.out.println((5 < 3) || (3 < 1)); 

        // System.out.println(1 < 3 < 5);

        // 논리 부정
        System.out.println(!true); 
        System.out.println(!false); 
        System.out.println(!(5 == 5));
        System.out.println(!(5 == 3)); 
    }
}
