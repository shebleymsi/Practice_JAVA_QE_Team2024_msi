package top_programizExamplesPractice_2024_running.examples_03_DecisionMakingAndLoop;

public class Problem_001_LeapYear {
    public static void main(String[] args) {
        int year = 1212;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

