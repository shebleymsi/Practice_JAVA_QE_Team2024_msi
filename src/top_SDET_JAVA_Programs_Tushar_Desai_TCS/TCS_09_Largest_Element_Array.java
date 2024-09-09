package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_09_Largest_Element_Array {
    //9. Find the Largest Element in an Array
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }

}
