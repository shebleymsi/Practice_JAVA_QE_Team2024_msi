package problems_midTermPractice_2022_2024_group_2025.practice_03_mathproblems;

public class Math_08_FindLowestDifference_01_Practice {

    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print("|" + array1[i] + "-" + array2[j] + "|=" + Math.abs(array1[i] - array2[j]) + ", ");
            }
            System.out.println();
        }

    }

}

