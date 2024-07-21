package GroupProblemsPractice_2024.group_05_Array;

public class ArrayMaximum_06 { //done

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        int max = getMaximum(array);
        System.out.println("Maximum element in the array: " + max);

    }

    public static int getMaximum(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}

