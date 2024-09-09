package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.ch_05_Array;

import java.util.Arrays;

public class Pg_212_03_Array_copy_and_create_Another_new_Array_using_metod {
    public static void main(String[] args) {
        int[] sourceArray = {23, 43, 55, 12};
        int[] copiedArray = Arrays.copyOf(sourceArray,8 );

        System.out.println(Arrays.toString(copiedArray));
    }

}
