package Chap3_Example;

public class _11_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println(i);
        }
    }
    
}
