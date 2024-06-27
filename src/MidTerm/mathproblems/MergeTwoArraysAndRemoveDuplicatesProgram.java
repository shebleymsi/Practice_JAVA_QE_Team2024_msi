package MidTerm.mathproblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    public static void main(String[] args)
    {

        mergeArray();

    }

    public static int mergeArray(){
        int[] arrayA = new int[]{1, 3, 4};

        int[] arrayB = new int[]{4, 5, 6, 7, 8};

        IntStream number=IntStream.concat(Arrays.stream(arrayA), Arrays.stream(arrayB));
        int []remove=number.distinct().sorted().toArray();
        System.out.println(Arrays.toString(remove));

        return 0;
    }


}






