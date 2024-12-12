package zQE_practiceNotebook.SumOfNumbers;

public class CheckSumOfNumbers { // done

    public static void main(String[] args) {
        int num = 20;
        int total = getTheSumOfNumbers(num);
        System.out.println(total );
    }

    public static int getTheSumOfNumbers(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) { // Increment by 1
            sum = sum + i;
        }
        return sum;
    }

}
