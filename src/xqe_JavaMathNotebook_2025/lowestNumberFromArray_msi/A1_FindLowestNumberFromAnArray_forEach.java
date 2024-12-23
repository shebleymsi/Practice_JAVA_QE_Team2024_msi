package xqe_JavaMathNotebook_2025.lowestNumberFromArray_msi;

public class A1_FindLowestNumberFromAnArray_forEach {
    public static void main(String[] args) {
        int[] my_Array = {7, 10, 20, 4, 13};
        int minValue = my_Array[0];

        for (int i : my_Array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println(minValue);
    }

}
