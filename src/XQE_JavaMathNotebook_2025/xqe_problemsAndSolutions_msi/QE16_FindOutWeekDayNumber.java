package XQE_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

import java.util.Scanner;

public class QE16_FindOutWeekDayNumber {

    public static void main(String[] args) {
        getWeekDayNumber();
    }

    public static void getWeekDayNumber() {
        // Switch case: Alternative of if else if
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your day name: ");
        String day = input.nextLine().toLowerCase();

        int dayNumber;

        switch (day) {
            case "monday":
                dayNumber = 1;
                break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber = 4;
                break;
            case "friday":
                dayNumber = 5;
                break;
            case "saturday":
                dayNumber = 6;
                break;
            case "sunday":
                dayNumber = 7;
                break;
            default: // else
                dayNumber = 0;
                break;
        }
        System.out.println("Day name " + dayNumber);
    }

}
