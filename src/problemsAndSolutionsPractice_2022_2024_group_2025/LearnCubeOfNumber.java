package problemsAndSolutionsPractice_2022_2024_group_2025;

public class LearnCubeOfNumber {

    public static void main(String[] args) {
        // Initialize a string that contains the number "321"
        String number = "321";

        // Loop through each character in the string "number"
        for (int i = 0; i < number.length(); i++) {
            // Convert the current character to its corresponding integer value
            int num = Character.getNumericValue(number.charAt(i));
            // Calculate the cube of the integer value
            int cube = num * num * num;
            // Print the cube of the integer value
            System.out.println(cube);
        }
    }
}
