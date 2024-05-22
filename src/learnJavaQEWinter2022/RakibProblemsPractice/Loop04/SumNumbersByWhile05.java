package learnJavaQEWinter2022.RakibProblemsPractice.Loop04;
public class SumNumbersByWhile05 { //done
    public static void main(String[] args) {
        getSumForLoop();
        getSumWhileLoop();
        getSumForEachLoop();
    }

    public static void getSumForLoop() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("Sum of numbers from 1 to 100 (for loop): " + sum);

    }
    public static void getSumWhileLoop() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i; // sum = sum + i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);
    }



    public static void getSumForEachLoop() {
        // Create an array with numbers from 1 to 100
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Calculate the sum using a for-each loop
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers from 1 to 100 (for-each loop): " + sum);
    }

    /*
Using a for Loop:
1. Initialize sum to 0.
2. Iterate from 1 to 100 using a for loop.
3. Add each number to sum.

Using a for-each Loop:
1. Create an array numbers of size 100.
2. Populate the array with numbers from 1 to 100.
3. Initialize sum to 0.
4. Iterate over the array using a for-each loop and add each number to sum.
*/


}
