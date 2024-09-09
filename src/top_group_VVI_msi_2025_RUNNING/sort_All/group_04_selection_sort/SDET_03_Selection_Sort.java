package top_group_VVI_msi_2025_RUNNING.sort_All.group_04_selection_sort;

public class SDET_03_Selection_Sort {
    //Sort an array without using in-built  method
    //Output:
    //Sorted array:
    //1 2 5 6 9
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        selectionSort(array);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

}
