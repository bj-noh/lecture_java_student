package Chap3_Example;
import java.util.Scanner;

public class _04_SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month, year;
        System.out.print("Enter month (1-12): ");
        month = input.nextInt();
        System.out.print("Enter year: ");
        year = input.nextInt();

        int days = 0;

        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }

        System.out.println("Number of days: " + days);
    }
        
}
