package XQE_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

public class QE06_SumOfOddNumbers {

    public static void main(String[] args) {
        int n = 15; // Upper limit
        int sum = getSumOfOddNumbers(n);
        System.out.println("The sum of odd numbers up to " + n + " is: " + sum);
    }

    public static int getSumOfOddNumbers(int n) {
        int sum = 0; // Variable to store the sum

        for (int i = 1; i <= n; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum = sum + i; // Add the odd number to the sum
            }
        }

        return sum;
    }
}


