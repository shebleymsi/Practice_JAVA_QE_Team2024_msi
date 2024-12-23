package problems_midTermPractice_2022_2024_group_2025.practice_03_mathproblems;

public class Math_03_09_PrimeNumber_seriesOnly_before_input_final_Number {

    public static void main(String[] args) { // (মৌলিক সংখ্যা)
        final int m = 2;
        int count, n = 20;

        // Finding prime numbers in the range
        for (int i = m; i <= n; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count = count + 1;
                    break;
                }
            }

            if (count == 0 && i > 1) { // Condition for prime numbers
                System.out.print(i + " ");
            }
        }
    }
}
