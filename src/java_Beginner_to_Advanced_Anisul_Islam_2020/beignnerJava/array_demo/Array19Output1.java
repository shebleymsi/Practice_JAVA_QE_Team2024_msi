package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.array_demo;

public class Array19Output1 {

    public static void main(String[] args) {

        int[][] A = new int[4][5];
        int K = 0;
        // Assining Value to the 2D Array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = K;
                K++;

            }
        }
        //Printing the element
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + A[i][j]);
            }
            System.out.println("");
        }
        
    }
}
