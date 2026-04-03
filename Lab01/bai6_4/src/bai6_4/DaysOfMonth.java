package bai6_4;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        int year = 0;

        while (month < 1 || month > 12) {
            System.out.println("Enter month (e.g. January, Jan, 1): ");
            String input = sc.nextLine().trim();
            try {
                month = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                switch (input.toLowerCase()) {
                    case "january": case "jan": month = 1; break;
                    case "february": case "feb": month = 2; break;
                    case "march": case "mar": month = 3; break;
                    case "april": case "apr": month = 4; break;
                    case "may": month = 5; break;
                    case "june": case "jun": month = 6; break;
                    case "july": case "jul": month = 7; break;
                    case "august": case "aug": month = 8; break;
                    case "september": case "sep": month = 9; break;
                    case "october": case "oct": month = 10; break;
                    case "november": case "nov": month = 11; break;
                    case "december": case "dec": month = 12; break;
                    default: month = 0;
                }
            }
            if (month < 1 || month > 12)
                System.out.println("Invalid month! Please enter again.");
        }

        while (year <= 0) {
            System.out.println("Enter year (e.g. 1999): ");
            try {
                year = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                year = 0;
            }
            if (year <= 0)
                System.out.println("Invalid year! Please enter again.");
        }

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                days = 31; break;
            case 4: case 6: case 9: case 11:
                days = 30; break;
            case 2:
                boolean isLeap = (year % 4 == 0 && year % 100 != 0)
                               || (year % 400 == 0);
                days = isLeap ? 29 : 28;
                break;
            default:
                days = 0;
        }

        System.out.println("Number of days: " + days);
    }
}