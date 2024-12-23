package xqe_JavaMathNotebook_2025.lowestNumberFromArray_msi;

public class B3_FindLowestNumberFromAnArray_ReturnType_forLoop {
    public static void main(String[] args) {
        int[] my_Array = {7, 10, 20, 4, 13};
        int minValue = findLowestNumber(my_Array);
        System.out.println(minValue);
    }

    // Helper method to find and return the lowest number in an array
    public static int findLowestNumber(int[] my_Array) {
        int minValue = my_Array[0];
        for (int i = 0; i < my_Array.length; i++) {
            if (my_Array[i] < minValue) {
                minValue = my_Array[i];
            }
        }
        return minValue;
    }

}
