package top_w3schools.java_01_Tutorial;

import java.util.Scanner;

public class Tutorial_10_WeekDay_Switch {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("please enter the number among 1 to 7: ");
        }
    }
}
