package Chap5_Example;

public class _08_StringCompare {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));

        // 대소문자 구분 안함
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "abcde"; 
        s2 = "abcde";
        System.out.println(s1.equals(s2)); // true ==> 내용 비교
        System.out.println(s1 == s2); // true ==> 주소값 비교

        s1 = new String("abcde");
        s2 = new String("abcde");
        System.out.println(s1.equals(s2)); // true ==> 내용 비교
        System.out.println(s1 == s2); // false ==> 주소값 비교
        
    }
}
