package w3schools.java_01_Tutorial;

public class Tutorial_23_2D_Array_for_Loop {

    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);

            }
            
        }
    }
}
