package java_Programming_EXERCISE_ANM_Bazlur_Rahman_2025_RUNNING.ch_05_Array;

import java.util.Arrays;

public class Pg_50 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

}

