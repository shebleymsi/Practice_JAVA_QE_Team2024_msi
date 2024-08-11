package problems_midTermPractice_2022_2024.practice_03_mathproblems;

public class Math_05_Pyramid_BOSS_100_100 {
    /*   Implement a large Pyramid of stars in the screen with java.
            *
           * *
          * * *
         * * * *
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the last row element by an integer number: ");
//        int n = input.nextInt();

        int n = 4;
        printTriangle(n);
    }
        public static void printTriangle(int n) { //n = 4
            for (int i = 0; i < n; i++) {

                for (int j = n - i; j > 1; j--) {
                    System.out.print("1");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print("*2");
                }
                System.out.println("---\t"+i);
            }
        }
    }
