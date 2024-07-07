package problemsAndSolutionsPractice;

public class FindOutSumOfAllTheElementsFromArray {

    public static void main(String[] args) {

        int[] array = {23, 56, 88, 99, 45, 23, 12, 5, 990};

        sumOfElementsUseForLoop(array);
        sumOfElementsUseWhileLoop(array);


    }

    public static void sumOfElementsUseForLoop(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum = " + sum);

    }

    public static void sumOfElementsUseWhileLoop(int[] arr) {
        int sum = 0;
        int i = 0;
        while(i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("Sum = " + sum);

    }


}
