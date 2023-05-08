package Chap5_Example;

public class _07_StringArray {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "Americano";
        String coffeeRachel = "Caffe Mocha";
        String coffeeChandler = "Latte";
        String coffeeMonica = "Cappuccino";

        System.out.println("One " + coffeeRoss);
        System.out.println("One " + coffeeRachel);
        System.out.println("One " + coffeeChandler);
        System.out.println("One " + coffeeMonica);

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[4];

        // 두 번째 방법
        // String coffees[] = new String[4];
//        coffees[0] = "Americano"; // 0 부터 시작
//        coffees[1] = "Caffe Mocha";
//        coffees[2] = "Latte";
//        coffees[3] = "Cappuccino";

        // 세 번째 방법
        // String[] coffees = new String[] { "Americano", "Caffe Mocha", "Latte", "Cappuccino" };

        // 네 번째 방법
        String[] coffees = { "Americano", "Caffe Mocha", "Latte", "Cappuccino" };

        System.out.println("---------------------------");

        // Order
        System.out.println("One " + coffees[0]);
        System.out.println("One " + coffees[1]);
        coffees[2] = "Espresso"; // 값 변경
        System.out.println("One " + coffees[2]);
        System.out.println("One " + coffees[3]);

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};
    }
}
