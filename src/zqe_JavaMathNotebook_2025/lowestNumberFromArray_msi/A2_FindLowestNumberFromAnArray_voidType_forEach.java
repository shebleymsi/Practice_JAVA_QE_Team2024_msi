package zqe_JavaMathNotebook_2025.lowestNumberFromArray_msi;

public class A2_FindLowestNumberFromAnArray_voidType_forEach {
    public static void main(String[] args) {
        int[] my_Array = {7, 10, 20, 4, 13};
        findLowestNumber(my_Array);
    }

    // Helper method to find and print the lowest number in an array
    public static void findLowestNumber(int[] my_Array) {
        int minValue = my_Array[0];
        for (int num : my_Array) {
            if (num < minValue) {
                minValue = num;
            }
        }
        System.out.println(minValue);
    }
}