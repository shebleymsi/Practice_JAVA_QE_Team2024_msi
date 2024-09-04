package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

public class TCS_05_Prime_Number_Check {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }


}
