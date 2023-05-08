package assignment07_01_answer;
import java.util.Scanner;

public class CalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        int startDay = dayOfWeek(1, month, year);
        int daysInMonth = daysInMonth(month, year);

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (String day : days) {
            System.out.print(day + "\t");
        }
        System.out.println();

        for (int i = 0; i < startDay; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.print(i + "\t");
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int daysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static int dayOfWeek(int day, int month, int year) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year--;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }
}
