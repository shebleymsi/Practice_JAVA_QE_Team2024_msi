package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

public class ArrayMinimum_07 { //done

    public static void main(String[] args) { //done

        int[] array = {50, 30, 20, 40, 10};

        int min = getMinimum(array);
        System.out.println("Minimum element in the array: " + min);

    }

    public static int getMinimum(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

