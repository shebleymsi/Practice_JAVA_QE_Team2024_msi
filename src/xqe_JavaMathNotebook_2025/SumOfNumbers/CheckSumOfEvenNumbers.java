package xqe_JavaMathNotebook_2025.SumOfNumbers;

public class CheckSumOfEvenNumbers { // done
    public static void main(String[] args) {
        int num = 20;
        int total = getTheSumOfEvenNumbers(num);
        System.out.println(total);
    }

    public static int getTheSumOfEvenNumbers(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i += 2) { // Increment by 2
            sum = sum + i;
        }
        return sum;
    }
}
