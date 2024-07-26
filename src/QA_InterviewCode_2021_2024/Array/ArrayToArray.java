package QA_InterviewCode_2021_2024.Array;
import java.util.Arrays;
public class ArrayToArray {
    public static void main(String[] args) {
            int[] array1 = new int[]{5, 10, -10};
            int[] array2 = new int[]{8, -10, 2};
            System.out.println("Array1 : " + Arrays.toString(array1));
            System.out.println("Array2 : " + Arrays.toString(array2));
            int[] newArray = new int[]{array1[0], array2[2]};
            int[] newArray1 = new int[]{array1[0] + array2[2]};
            System.out.println("New_array : " + Arrays.toString(newArray));
            System.out.println("New_array sum : " + Arrays.toString(newArray1));
        }
    }

