package top_w3schools.java_01_Tutorial;

public class Tutorial_23_2D_Array_foreach_Loop {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
