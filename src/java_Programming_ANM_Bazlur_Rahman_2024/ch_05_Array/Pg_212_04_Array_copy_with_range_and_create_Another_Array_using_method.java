package java_Programming_ANM_Bazlur_Rahman_2024.ch_05_Array;

import java.util.Arrays;

public class Pg_212_04_Array_copy_with_range_and_create_Another_Array_using_method {
    public static void main(String[] args) {
        int[] sourceArray = {23, 43, 55, 12, 40, 20};
        int[] copyOfRangeArray = Arrays.copyOfRange(sourceArray, 1, 4); // here 4 is exclusive

        System.out.println("Copied array using Arrays.copyOfRange: " + Arrays.toString(copyOfRangeArray));


        System.out.println("Elements of the copied array using traditional for loop:");
        for (int i = 0; i < copyOfRangeArray.length; i++) {
            System.out.println(copyOfRangeArray[i]);
        }

        System.out.println("Elements of the copied array using for-each loop:");
        for (int newArray : copyOfRangeArray) {
            System.out.println(newArray);
        }
    }
}
