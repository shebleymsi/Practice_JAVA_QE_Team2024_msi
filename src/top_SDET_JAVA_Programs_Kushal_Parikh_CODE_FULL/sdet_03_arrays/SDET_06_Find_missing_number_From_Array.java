package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_03_arrays;

public class SDET_06_Find_missing_number_From_Array {
    //Find the missing number in an Array
    //Output:
    //The missing number is: 3
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; // Missing number is 3
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Since one number is missing, the length  should be n+1
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        for (int num : array) {
            arraySum = arraySum + num;
        }
        return totalSum - arraySum;
    }

}
