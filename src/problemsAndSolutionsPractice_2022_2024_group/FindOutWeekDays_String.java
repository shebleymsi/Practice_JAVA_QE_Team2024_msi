package problemsAndSolutionsPractice_2022_2024_group;

import java.util.Scanner;

public class FindOutWeekDays_String {
    public static void main(String[] args) {
        getWeekDays();
    }
    public static void getWeekDays() {
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
