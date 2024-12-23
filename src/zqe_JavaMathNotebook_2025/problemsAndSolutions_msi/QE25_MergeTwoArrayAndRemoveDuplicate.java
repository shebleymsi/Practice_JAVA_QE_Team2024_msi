package zqe_JavaMathNotebook_2025.problemsAndSolutions_msi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QE25_MergeTwoArrayAndRemoveDuplicate {
    public static void main(String[] args) {
        int[] arrayA = {1, 3, 4, 6};
        int[] arrayB = {3, 9, 4, 6, 55, 99};
        int[] mergeArray = mergeTwoArrayAndRemoveDuplicate(arrayA, arrayB);
        System.out.println(Arrays.toString(mergeArray));
    }

    public static int[] mergeTwoArrayAndRemoveDuplicate(int[] arrayA, int[] arrayB) {
        IntStream number = IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB));
        int[] remove = number.distinct().sorted().toArray();
        return remove;
    }
}
