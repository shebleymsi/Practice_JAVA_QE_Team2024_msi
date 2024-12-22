package w3_DSA.dsa01_arrays;

public class DSA01_Arrays {
    public static void main(String[] args) {
        int[] my_array = {7, 12, 9, 4, 11};
        int minVal = my_array[0];

        for (int i : my_array) {
            if (i < minVal) {
                minVal = i;
            }
        }

        System.out.println("Lowest value: " + minVal);
    }
}
