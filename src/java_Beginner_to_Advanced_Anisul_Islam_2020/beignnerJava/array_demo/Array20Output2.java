package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.array_demo;

public class Array20Output2 {

    public static void main(String[] args) {

        int[][] number = new int[8][];
        int k = 0;

        number[0] = new int[1];
        number[1] = new int[2];
        number[2] = new int[3];
        number[3] = new int[4];
        number[4] = new int[5];
        number[5] = new int[6];
        number[6] = new int[7];
        number[7] = new int[8];
        //assigning
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i + 1; j++) {
                number[i][j] = k;
                k++;
            }
        }
        //Printing
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" " + number[i][j]);
            }
            System.out.println("");
        }

    }

}
