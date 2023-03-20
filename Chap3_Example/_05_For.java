package Chap3_Example;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        System.out.println("Thank you, 1");
        System.out.println("Thank you, 2");
        System.out.println("Thank you, 3");
        System.out.println("Thank you, 4");
        System.out.println("Thank you, 5");
        System.out.println("Thank you, 6");
        System.out.println("Thank you, 7");
        System.out.println("Thank you, 8");
        System.out.println("Thank you, 9");
        System.out.println("Thank you, 10");
        
        System.out.println(" ---- For loop ---- ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Thank you, " + i);
        }

        // 0, 2, 4, 6, 8
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 홀수만 출력
        // 1, 3, 5, 7, 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("Current total number is " + sum);
        }
        System.out.println("Total number from 1 to 10 is " + sum);
    }
}
