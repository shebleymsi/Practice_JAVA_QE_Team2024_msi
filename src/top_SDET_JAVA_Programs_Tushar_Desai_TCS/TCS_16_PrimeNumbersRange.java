package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_16_PrimeNumbersRange {
    //16. Print the Prime Numbers in a Range
    public static void main(String[] args) {
        int start = 10, end = 50;
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.print(num + " ");
            }
        }
    }


}
