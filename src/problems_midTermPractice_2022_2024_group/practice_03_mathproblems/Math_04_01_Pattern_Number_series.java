package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

public class Math_04_01_Pattern_Number_series {
    /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
     or,

     */
    public static void main(String[] args) {
        int num = 20;
        getNumberSeries(num);

    }

    public static int getNumberSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + ", ");
        }
        return n;
    }

}




