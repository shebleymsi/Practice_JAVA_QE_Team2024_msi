package XQE_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

public class QE24_FindOutSumOfAllTheElementsFromArray {

    public static void main(String[] args) {
        int[] array = {23, 56, 88, 99, 45, 23, 12, 5, 990};
        int sum = sumOfElements(array);
        System.out.println("Sum = " + sum);
    }

    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

//How can I find the sum of all the elements in an array using a Java program?