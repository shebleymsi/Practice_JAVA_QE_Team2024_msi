package xqe_JavaMathNotebook_2025.lowestNumberFromArray_msi;

public class B1_FindLowestNumberFromAnArray_forLoop {
    public static void main(String[] args) {
        int[] my_Array = {7, 10, 20, 4, 13};
        int minValue = my_Array[0];

        for (int i = 0; i < my_Array.length; i++) {
            if (my_Array[i] < minValue) {
                minValue = my_Array[i];
            }
        }
        System.out.println(minValue);
    }

}
