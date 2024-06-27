package RakibProblems.Loop04;

public class PrintArrayElements03 {

    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // print by for each loop

        System.out.println();

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // print by while loop
        System.out.println();
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
    }
}
