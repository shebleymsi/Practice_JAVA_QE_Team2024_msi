package Java_Programming_ANM_Bazlur_Rahman.ch_05_Array;

import java.util.Arrays;

public class Pg_212_04_Array_copy_with_range_and_cerate_Another_Array_using_metod {
    public static void main(String[] args) {
        int[] sourceArray = {23, 43, 55, 12, 40, 20};
        int[] copiedArray = Arrays.copyOfRange(sourceArray,1,4);

        System.out.println(Arrays.toString(copiedArray));
    }

}
