package Chap3_Example;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문
        // 별 (*) 사각형 만들기
        /*

        *****
        *****
        ***** 
        *****
        *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        
    }
}
