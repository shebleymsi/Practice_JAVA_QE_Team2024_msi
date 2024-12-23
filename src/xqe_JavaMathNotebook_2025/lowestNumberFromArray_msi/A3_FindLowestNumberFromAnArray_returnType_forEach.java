package xqe_JavaMathNotebook_2025.lowestNumberFromArray_msi;

public class A3_FindLowestNumberFromAnArray_returnType_forEach {
    public static void main(String[] args) {
        int[] my_Array = {7, 10, 20, 4, 13};
        int minValue = findLowestNumber(my_Array);
        System.out.println(minValue);
    }

    public static int findLowestNumber(int[] my_Array) {
        int minValue = my_Array[0];
        for (int i : my_Array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }
}
