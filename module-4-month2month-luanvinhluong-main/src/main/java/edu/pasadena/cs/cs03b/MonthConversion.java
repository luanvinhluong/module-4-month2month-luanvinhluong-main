package edu.pasadena.cs.cs03b;

public class MonthConversion {

    public static void main(String[] args) {
        int month = 0;

        month = Integer.parseInt(args[0]);
        String strMonth = MonthConversion.convertMonthWithSwitch(month);
        System.out.println("The month is " + strMonth);
    }

    // TODO: complete the implementation with nested if
    public static String convertMonthWithNestedIf(int nMonth) {
        String monthString = "WRONG";

        if (nMonth == 1) {
            monthString = "January";
        } else if (nMonth == 2) {
            monthString = "Feburary";
        } else if (nMonth == 3) {
            monthString = "March";
        } else if (nMonth == 4) {
            monthString = "Aprial";
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
