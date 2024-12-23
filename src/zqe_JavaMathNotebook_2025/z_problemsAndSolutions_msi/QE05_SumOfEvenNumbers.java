package zqe_JavaMathNotebook_2025.z_problemsAndSolutions_msi;

public class QE05_SumOfEvenNumbers {

    public static void main(String[] args) {
        int n = 15; // Upper limit
        int sum = getSumOfEvenNumbers(n);
        System.out.println("The sum of even numbers up to " + n + " is: " + sum);
    }

    public static int getSumOfEvenNumbers(int n) {
        int sum = 0; // Variable to store the sum

        for (int i = 1; i <= n; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum = sum + i; // Add the even number to the sum
            }
        }

        return sum;
    }
}


