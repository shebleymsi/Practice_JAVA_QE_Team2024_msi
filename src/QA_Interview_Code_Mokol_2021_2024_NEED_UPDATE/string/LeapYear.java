package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.string;

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

