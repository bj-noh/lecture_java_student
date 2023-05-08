package Chap5_Example;

public class _04_String1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "I like Java and Python and C.";
        System.out.println(s);
        
        // JVM에 의한 객체 생성
        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = "bbb";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        
        // 사용자에 의한 객체 생성
        String s4 = new String("aaa");
        String s5 = new String("aaa");
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        
        // null String
        String strNull1 = new String();
        String strNull2 = "";
        String strNull3 = null;
        
        System.out.println(strNull1.isEmpty());
        System.out.println(strNull2.isEmpty());
        // System.out.println(strNull3.isEmpty());
    }
}
