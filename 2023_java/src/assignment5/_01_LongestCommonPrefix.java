package assignment5;

public class _01_LongestCommonPrefix {
	
	public static String findLongestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////

        return prefix;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 본 프로그램은 입력된 문자열 array에서 가장 긴 prefix를 출력하는 프로그램이다.
		 * findLongestCommonPrefix() 메소드를 작성하여 본 프로그램이 작동하도록 구현하시오.
		 * Prefix란 단어의 앞에 붙은 낱말을 의미하며,
		 * Common prefix는 각 단어에서 공통된 낱말을 의미한다.
		 * 예를 들어, "flower", "flow", "flight"의 common prefix는 "fl"이다.
		 */
		
        String[] words = {"conversion", "contribution", "conflict", "congestion"};
        String longestPrefix = findLongestCommonPrefix(words);
        System.out.println("Longest common prefix: " + longestPrefix);
    }    
}