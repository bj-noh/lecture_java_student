package Chap4_Example;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = { "Americano", "Caffe Mocha", "Latte", "Cappuccino" };
        

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println("One " + coffees[i]);
        }

        System.out.println("--------------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println("One " + coffees[i]);
        }
        System.out.println("--------------------------");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees) {
            System.out.println("One " + coffee);
        }
    }
}
