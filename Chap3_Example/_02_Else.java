package Chap3_Example;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if (hour < 14) { // 오후 2시 이전이면
            System.out.println("Iced Americano +1");
        } else { // 그 외의 경우이면
            System.out.println("Iced Americano (Decaffeination) +1");
        }
        System.out.println("Coffee order completed #1");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 10;
        boolean morningCoffee = false;
        if (hour >= 14 || morningCoffee == true) { // 오후 2시 이후이거나 모닝 커피를 마신 경우?
            System.out.println("Iced Americano (Decaffeination) +1");
        } else { // 그 외의 경우이면
            System.out.println("Iced Americano +1");
        }
        System.out.println("Coffee order completed #2");
    }
}
