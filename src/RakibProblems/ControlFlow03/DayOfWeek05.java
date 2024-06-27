package RakibProblems.ControlFlow03;
import java.util.Scanner;


public class DayOfWeek05 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the day of the week (1-7): ");
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
    }

