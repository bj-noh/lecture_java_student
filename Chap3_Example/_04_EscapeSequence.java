package Chap3_Example;

public class _04_EscapeSequence {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("Java");
        System.out.println("is");
        System.out.println("very fun");

        // \n : 줄바꿈
        System.out.println("Java \nis\nveryfun");

        // \t : 탭
        // Apple   $9
        // Banana  $8
        // Pumpkin $7
        System.out.println("Apple\t\t$9");
        System.out.println("Banana\t\t$8");
        System.out.println("Pumpkin\t\t$");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰따옴표
        System.out.println("A cat says \"meow\" ");

        // \' : 작은따옴표
        System.out.println("A cat made an expression like,  \'What are you lookng at?\'");
        System.out.println("A cat made an expression like,  'What are you lookng at?'");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
