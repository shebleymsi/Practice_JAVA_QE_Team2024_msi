package problems_midTermPractice_2022_2024.practice_03_mathproblems;

public class Math_08_FindLowestDifference_01_Practice_ {

    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                int difference = Math.abs(array1[i] - array2[j]);
                // remove last comma from output[console]
                if (j == array2.length-1) {
                    System.out.print("|" + array1[i] + "-" + array2[j] + "|=" + difference);
                } else {
                    System.out.print("|" + array1[i] + "-" + array2[j] + "|=" + difference + ", ");
                }
            }
            System.out.println();
        }

    }

}

