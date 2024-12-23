package problemsAndSolutionsPractice_2022_2024_group_2025;

import java.util.Arrays;

public class FindOutGreatestNumber_02_Array_Sorting_01 {


    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0]=35;
        numbers[1]=100;
        numbers[2]=87;
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int largest = numbers[numbers.length - 1];
        System.out.println(largest + " is the largest number");
    }
}


