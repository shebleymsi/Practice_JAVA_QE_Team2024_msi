package problemsAndSolutionsPractice_2022_2024;

public class FindOutGreatestNumber_01_Math_Library {

    public static void main(String[] args) {

        int num1 = 35, num2 = 100, num3 = 87;

        int largest = Math.max(num1, Math.max(num2, num3));  // Example: Math.max(20, 30)

        System.out.println(largest + " is the largest number");
    }

}
