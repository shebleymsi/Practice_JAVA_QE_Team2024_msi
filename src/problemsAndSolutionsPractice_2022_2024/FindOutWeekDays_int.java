package problemsAndSolutionsPractice_2022_2024;

import java.util.Scanner;

public class FindOutWeekDays_int {

    public static void main(String[] args) {
        getWeekDays();
    }

    public static void getWeekDays() {
        // Switch case: Alternative of if else if
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your day serial of the week");
        int day = input.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: // else
                dayName = "out of the day";
                break;
        }
        System.out.println("Day name " + dayName);
    }


}