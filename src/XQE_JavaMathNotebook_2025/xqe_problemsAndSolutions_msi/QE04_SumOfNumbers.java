package XQE_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

public class QE04_SumOfNumbers {
    public static void main(String[] args) {
        int sum = getSumOfNumbers(15); // Call the method and store the returned sum
        System.out.println( sum);
    }

    public static int getSumOfNumbers(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i; // Accumulate the sum
        }
        return sum; // Return the sum
    }
}

//How can I calculate the sum of all numbers from 0 to a given number in Java?