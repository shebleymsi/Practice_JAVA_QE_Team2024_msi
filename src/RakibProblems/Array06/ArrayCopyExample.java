package RakibProblems.Array06;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[3]; // Destination array to copy elements into

        // Copy elements from sourceArray to destinationArray
        System.arraycopy(sourceArray, 2, destinationArray, 0, 3);

        // Print the elements of destinationArray
        System.out.println("Copied elements:");
        for (int num : destinationArray) {
            System.out.println(num);
        }
    }
}
