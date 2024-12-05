package w3schools.java_How_To;

public class How_To_4_Calculate_Sum_of_an_Array {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}
