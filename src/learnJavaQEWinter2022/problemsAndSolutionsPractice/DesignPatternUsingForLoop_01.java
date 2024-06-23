package learnJavaQEWinter2022.problemsAndSolutionsPractice;

public class DesignPatternUsingForLoop_01 {


    public static void main(String[] args) {

        System.out.println("----------------------pattern : 01");
        pattern1(4);
        System.out.println("----------------------pattern : 02");
        pattern2(4);
        System.out.println("----------------------pattern : 03");
        pattern3(4);
        System.out.println("----------------------pattern : 04");
        pattern4(4);
        System.out.println("----------------------pattern : 05");
        pattern5(4);

    }

    static void pattern5(int n) {


    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}