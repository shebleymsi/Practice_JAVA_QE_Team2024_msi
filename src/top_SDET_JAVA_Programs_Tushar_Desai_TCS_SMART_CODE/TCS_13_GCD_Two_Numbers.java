package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

public class TCS_13_GCD_Two_Numbers {
    //13. Calculate GCD of Two Numbers
    public static void main(String[] args) {
        int a = 60, b = 48;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

}
