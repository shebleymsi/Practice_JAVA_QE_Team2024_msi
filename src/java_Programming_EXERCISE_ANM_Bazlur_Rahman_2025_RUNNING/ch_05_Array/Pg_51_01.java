package java_Programming_EXERCISE_ANM_Bazlur_Rahman_2025_RUNNING.ch_05_Array;

import java.util.Arrays;
import java.util.Collections;

public class Pg_51_01 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}

