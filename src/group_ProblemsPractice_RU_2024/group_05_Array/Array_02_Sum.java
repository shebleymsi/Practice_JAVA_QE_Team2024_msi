package group_ProblemsPractice_RU_2024.group_05_Array;

public class Array_02_Sum { // done
    public static void main(String[] args) {

        getSum1(); // use for-each loop
        getSum();  // use for loop

    }

    // Using a regular for-each loop to calculate the sum of array elements
    public static void getSum1() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {
            sum += num; // sum = sum + num
        }

        System.out.println("Sum of array elements use for-each loop: " + sum);
    }

    // Using a regular for loop to calculate the sum of array elements
    public static void getSum() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of array elements use for loop: " + sum);
    }


}

