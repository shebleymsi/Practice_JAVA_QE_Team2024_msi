package problemsAndSolutionsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DetermineIncreaseDecreaseOrder_01 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three(3) number: ");

        Integer[] numbers = new Integer[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        findOutOrder(numbers);
    }

    public static void findOutOrder(Integer[] numbers) {


        if (numbers[0] < numbers[1] && numbers[1] < numbers[2]) {
            System.out.println("Numbers are in increasing order.");

            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));

        } else if (numbers[0] > numbers[1] && numbers[1] > numbers[2]) {
            System.out.println("Numbers are in decreasing order.");

            Arrays.sort(numbers, Collections.reverseOrder());
            System.out.println("Numbers in decreasing order is: " + Arrays.toString(numbers));

        } else {
            System.out.println("Numbers are neither in increasing nor decreasing order.");
            System.out.println(Arrays.toString(numbers));
        }

    }


}


