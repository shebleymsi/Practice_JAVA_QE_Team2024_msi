package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_03_arrays;

public class SDET_07_Largest_smallest_element_Array {
    //Find the largest and smallest  element in an Array
    //Output:
    //Smallest element: 1
    //Largest element: 9
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        int[] result = findLargestAndSmallest(array);
        System.out.println("Smallest element: " + result[0]);  System.out.println("Largest element: " + result[1]);  }
    public static int[] findLargestAndSmallest(int[] array) {  if (array == null || array.length == 0) {
        throw new IllegalArgumentException("Array must not be null or  empty");
    }
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        return new int[]{smallest, largest};
    }

}
