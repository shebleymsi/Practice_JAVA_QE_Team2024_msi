package java_Programming_ANM_Bazlur_Rahman_2024.ch_05_Array;

public class pg_218_TwoDimensionalArray_Nested_Loop {
    public static void main(String[] args) {
        // A 12x8 grid in [row][col]
        int[][] array = new int[12][8];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = row * column + 1;
            }
        }

        //Print Array
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%3d", array[row][column]);
            }
            System.out.println();
        }
    }
}


