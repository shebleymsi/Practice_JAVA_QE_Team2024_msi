
package rakibProblemsPractice.array05;

public class ArrayAverage_08 { //done
    public static void main(String[] args) {
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5};
        printAverage(array);
    }

    /**
     * Calculate and print the average of elements in the array
     *
     * @param array the array containing the elements
     */
    public static void printAverage(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; // sum += array[i];
        }

//        for (double num : array) {
//            sum += num; //sum = sum + num;
//        }

        double average = sum / array.length;
        System.out.println("Average of array elements: " + average);
    }

}
