package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

public class Math_07_FindMissingNumber_00_practice {


    public static void main(String[] args) {

        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }

        // Calculate the expected sum of numbers from 1 to n [Example:  1 to 10 ]
        int sum = n*(n+1)/2;
        System.out.println("\n++++++++"+sum);

        // Calculate the expected sum of numbers from 1 to n+1 [Example:  1 to 10+1 ]
        int sum1 = (n + 1) * (n + 2) / 2;
        System.out.println("\n"+sum1);
    }
}
