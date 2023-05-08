package assignment07_01;
import java.util.Scanner;

public class CalendarPrinter {

    public static void main(String[] args) {
    	
    	/*
    	 * 연도(year)와 월(month)를 입력 받아 그 달의 달력을 출력하는 프로그램을 작성하시오.
    	 * 
    	 * 예시)
    	 *  Enter the year: 2023
			Enter the month (1-12): 4
			Sun	Mon	Tue	Wed	Thu	Fri	Sat	
									1	
			2	3	4	5	6	7	8	
			9	10	11	12	13	14	15	
			16	17	18	19	20	21	22	
			23	24	25	26	27	28	29	
			30	
			
			Enter the year: 2022
			Enter the month (1-12): 9
			Sun	Mon	Tue	Wed	Thu	Fri	Sat	
							1	2	3	
			4	5	6	7	8	9	10	
			11	12	13	14	15	16	17	
			18	19	20	21	22	23	24	
			25	26	27	28	29	30	
    	 * 
    	 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
    	// 달력을 출력하는 메소드
        int startDay = dayOfWeek(1, month, year);
        int daysInMonth = daysInMonth(month, year);

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////

    }

    private static boolean isLeapYear(int year) {
    	// 윤년을 검사하는 메소드
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }

    private static int daysInMonth(int month, int year) {
    	// 한 달의 일수를 계산하는 메소드
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }

    private static int dayOfWeek(int day, int month, int year) {
    	// 한 달의 시작 요일을 결정하는 메소드
        /////////////// CODE HERE ///////////////
        
        /////////////////////////////////////////
    }
}
