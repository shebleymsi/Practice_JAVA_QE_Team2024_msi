package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_33_LeapYear {
    //33. Check if a Year is Leap Year
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap);
    }

}
