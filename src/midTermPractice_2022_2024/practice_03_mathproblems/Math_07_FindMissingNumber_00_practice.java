package midTermPractice_2022_2024.practice_03_mathproblems;

public class Math_07_FindMissingNumber_00_practice {


    public static void main(String[] args) {

        int n = 9;
        for (int i = 0; i < n; i++) {
            System.out.print(i+" ");
        }

        // Calculate the expected sum of numbers from 1 to n+1
        int sum = (n + 1) * (n + 2) / 2;
        System.out.println("\n"+sum);
    }
}
