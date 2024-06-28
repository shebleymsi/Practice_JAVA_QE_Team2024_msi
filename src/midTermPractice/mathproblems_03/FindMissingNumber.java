package midTermPractice.mathproblems_03;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        Scanner sc = new Scanner(System.in);

        //Declare array size
        System.out.println("Enter the total number of elements ");
        int n = sc.nextInt();     //Initialize array size

        int arr[] = new int[n];   //Declare array
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++)     //Initialize array
        {
            arr[i] = sc.nextInt();
        }

        int sum = (n + 1) * (n + 2) / 2;   //Calculate the expected sum of all the elements from 1 to n
        for (int i = 0; i < n; i++) {
            sum = sum - arr[i]; //Subtract each element from the sum
            System.out.println(sum);
        }
        System.out.println("Missing Element is " + sum);  //Print the missing element
    }

    public static boolean misssing(){
        Scanner sc = new Scanner(System.in);

        //Declare array size
        System.out.println("Enter the total number of elements ");
        int n = sc.nextInt();     //Initialize array size

        int arr[] = new int[n];   //Declare array
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++)     //Initialize array
        {
            arr[i] = sc.nextInt();
        }

        int sum = (n + 1) * (n + 2) / 2;   //Calculate the expected sum of all the elements from 1 to n
        for (int i = 0; i < n; i++) {
            sum = sum - arr[i]; //Subtract each element from the sum
            System.out.println(sum);
        }
        return true;
    }
}







