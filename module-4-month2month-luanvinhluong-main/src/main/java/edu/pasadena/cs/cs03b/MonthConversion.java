package edu.pasadena.cs.cs03b;

import java.util.Scanner;

public class MonthConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ans;

        do {
            int monthUsingSwitch = 0, monthUsingNestedIf = 0;

            System.out.println("Enter a integer numbers for month using switch: ");
            monthUsingSwitch = scanner.nextInt();

            System.out.println("Enter a integer number for month using nested if");
            monthUsingNestedIf = scanner.nextInt();

            String strMonth = MonthConversion.convertMonthWithSwitch(monthUsingSwitch);
            String strMonthNI = MonthConversion.convertMonthWithNestedIf(monthUsingNestedIf);

            System.out.println("Switch, the month is " + strMonth);
            System.out.println("Nested If, the month is " + strMonthNI);

            System.out.println("Press Y for another calculation");
            ans = scanner.next().charAt(0);
        } while (ans == 'y' || ans == 'Y');

    }

    // TODO: complete the implementation with nested if
    public static String convertMonthWithNestedIf(int nMonth) {
        String monthString = "WRONG";

        if (nMonth == 1) {
            monthString = "January";
        } else if (nMonth == 2) {
            monthString = "February";
        } else if (nMonth == 3) {
            monthString = "March";
        } else if (nMonth == 4) {
            monthString = "April";
        } else if (nMonth == 5) {
            monthString = "May";
        } else if (nMonth == 6) {
            monthString = "June";
        } else if (nMonth == 7) {
            monthString = "July";
        } else if (nMonth == 8) {
            monthString = "August";
        } else if (nMonth == 9) {
            monthString = "September";
        } else if (nMonth == 10) {
            monthString = "October";
        } else if (nMonth == 11) {
            monthString = "November";
        }
        // add nested if from Feburary to November
        else if (nMonth == 12) {
            monthString = "December";
        } else {
            monthString = "No Such Month";
        }

        return monthString;
    }

    // TODO: complete the implementation with switch
    public static String convertMonthWithSwitch(int nMonth) {

        String monthString = "WRONG";
        switch (nMonth) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "No such Month";
                // TODO: Add the rest of the months here
                // TODO: add a default case to output "No Such Month"
        }

        return monthString;
    }
}
