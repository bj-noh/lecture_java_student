package Chap3_Example;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오후 3시

        // if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if (hour < 14)
            System.out.println("Iced Americano +1");

        // if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
        if (hour < 14) {
            System.out.println("Iced Americano +1");
            System.out.println("Add one shot");
        }
        System.out.println("Coffee order completed #1");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; // 모닝 커피
        // if (hour < 14 && morningCoffee == false) {
        if (hour < 14 && !morningCoffee) {
            System.out.println("Iced Americano +1");
        }
        System.out.println("Coffe order completed #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        // if (hour >= 14 || morningCoffee == true) {
        if (hour >= 14 || morningCoffee) {
            System.out.println("Iced Americano (Decaffeination) +1");
        }
        System.out.println("Coffe order completed #3");
    }
}
