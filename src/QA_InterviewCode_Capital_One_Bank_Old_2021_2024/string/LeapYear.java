package QA_InterviewCode_Capital_One_Bank_Old_2021_2024.string;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        if (year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) {
            System.out.println(year + "--This is not a leap year.");
        } else {
            System.out.println(year + "--This is a leap year.");
        }
    }
    }

