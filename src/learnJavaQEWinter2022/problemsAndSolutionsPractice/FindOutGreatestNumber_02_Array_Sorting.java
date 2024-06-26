package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.Arrays;

public class FindOutGreatestNumber_02_Array_Sorting {
    public static void main(String[] args) {

        int num1 = 35, num2 = 100, num3 = 87;
        int[] numbers = {num1, num2, num3};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

       int largest = numbers[numbers.length-1];
       int middle_value = numbers[(numbers.length-1)/2];
       int smallest = numbers[0];

       System.out.println(largest + " is the largest number");
       System.out.println(middle_value + " is the middle_value number");
       System.out.println(smallest + " is the smallest number");
    }
}
