package midTermPractice.mathproblems_03;

public class Math_04_Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */

    }

    public static int num(int num) {
        num = 100;
        for (int i = num; i >= 0; i--) {
            System.out.print(i + ",");
        }


        return num;

    }
}




