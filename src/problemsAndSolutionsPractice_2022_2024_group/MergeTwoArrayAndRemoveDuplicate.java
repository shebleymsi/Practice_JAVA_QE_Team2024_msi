package problemsAndSolutionsPractice_2022_2024_group;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayAndRemoveDuplicate {
    // Merge Two Array into single sorted Array without duplicate
    // Given arrayA={1,3,4,6}
    // Given arrayB={3,9,4,6,55,99}
    public static void main(String[] args) {
        int[] arrayA = {1, 3, 4, 6};
        int[] arrayB = {3, 9, 4, 6, 55, 99};

        int [] mergeArray= mergeTwoArrayAndRemoveDuplicate(arrayA,arrayB);
        System.out.println(Arrays.toString(mergeArray));

    }

    public static int[] mergeTwoArrayAndRemoveDuplicate(int[] arrayA, int[] arrayB) {

        IntStream number = IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB));

        int[] remove = number.distinct().sorted().toArray();

        return remove;
    }

}
