package Java_Programming_ANM_Bazlur_Rahman.ch_05_Array;

import java.util.Arrays;

public class Pg_215_Array_common_error {
    public static void main(String[] args) {

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }

        System.out.println("\n");
        for (int num : nums) {
            System.out.print(" " + num);
        }

        System.out.println("\n");
        System.out.print(Arrays.toString(nums));
    }

//    Important Note: off-by-one error
//    i <= numbers.length-1;
//      or,
//    i < numbers.length;
}
