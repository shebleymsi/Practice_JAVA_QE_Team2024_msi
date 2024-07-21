package midTermPractice_2022_2024.practice_03_mathproblems;
public class Math_04_Pattern {
    /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     *20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0,
     */
    public static void main(String[] args) {
        int num = 20;
        getReverseNumber(num);
    }
    public static int getReverseNumber(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + ", ");
        }
        return n;
    }

}




