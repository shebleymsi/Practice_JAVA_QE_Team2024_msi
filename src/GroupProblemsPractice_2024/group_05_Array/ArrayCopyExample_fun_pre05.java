package GroupProblemsPractice_2024.group_05_Array;

import java.util.Arrays;

public class ArrayCopyExample_fun_pre05 {

    // given Array(sourceArray): int[] sourceArray = {1, 2, 3, 4, 5};
    // Objective: Copy a specific portion from a given array
    // Key: System.arraycopy(sourceArray, 0, destinationArray, 0, 3);

    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        getArrayCopy(sourceArray);
    }

    public static void getArrayCopy(int[] sourceArray) { //done

        int[] destinationArray = new int[5]; // Destination array to copy elements into

        // Copy elements from sourceArray to destinationArray
        System.arraycopy(sourceArray, 2, destinationArray, 2, 3);
        //System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        //Length (3): This specifies the number of elements to be copied from the source array to the destination array.

        // Print the elements of destinationArray
        System.out.println("Copied elements:");

        // print: 1st time
        for (int num : destinationArray) {
            System.out.println(num);
        }

        // print: 2nd time
        System.out.println("===================================");
        //System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(destinationArray));


    }
}
