package xqe_JavaMathNotebook_2025.SumOfNumbers;

public class CheckSumOfOddNumbers { // done

    public static void main(String[] args) {
        int num = 20;
        int total = getTheSumOfOddNumbers(num);
        System.out.println(total);
    }

    public static int getTheSumOfOddNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i += 2) { // Increment by 2, starting from 1
            sum = sum + i;
        }
        return sum;
    }
}
