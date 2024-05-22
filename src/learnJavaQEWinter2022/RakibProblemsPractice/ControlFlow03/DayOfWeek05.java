package learnJavaQEWinter2022.RakibProblemsPractice.ControlFlow03;

import java.util.Scanner;

public class DayOfWeek05 { //done

    public static void main(String[] args) {
       getDayByNumberOfWeek();
      //  getDayByNameOfWeek();
    }

    public static void getDayByNumberOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number of the week (1-7): ");
        int day = scanner.nextInt();

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
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day of the week: " + dayName);

        scanner.close();

    }

    //==============================================================================================
    public static void getDayByNameOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day name of the week: ");
        String day = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        switch (day) {
            case "monday":
                System.out.println("Today is Monday.");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday.");
                break;
            case "wednesday":
                System.out.println("Today is Wednesday.");
                break;
            case "thursday":
                System.out.println("Today is Thursday.");
                break;
            case "friday":
                System.out.println("Today is Friday.");
                break;
            case "saturday":
                System.out.println("Today is Saturday.");
                break;
            case "sunday":
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid day entered.");
                break;
        }

        scanner.close();
    }

}

