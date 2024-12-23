package problemsAndSolutionsPractice_2022_2024_group_2025;


public class DesignPatternUsingForLoop_last { // Next

    public static void main(String[] args) {
        // Call the methods to print different triangle patterns
        designTriangle(5);   // Prints a right-angled triangle with 'a' characters with 5 rows
        rightTriangle(6);    // Prints a right-angled triangle with '*' characters with 6 rows
        reverseTriangle(5);  // Prints an inverted right-angled triangle with '*' characters with 7 rows
    }

    // Method to print a right-angled triangle pattern with letters 'a'
    public static void designTriangle(int row) { //https://www.youtube.com/watch?v=2ORtCWqcs7Y
        for (int i = 0; i < row; i++) { // Outer loop for each row // i=i+1
            // Inner loop for spaces
            for (int j = row - i; j > 1; j--) { // j=j-1
                System.out.print(" "); // Print space for formatting
            }
            // Inner loop for columns
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // Print 'a' followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }

    }


    // Method to print a right-angled triangle pattern with asterisks
    public static void rightTriangle(int rowNum) {
        for (int i = 1; i <= rowNum; i++) { // Outer loop for each row
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");// Print '*' followed by a space
            }
            System.out.print("\n"); // Move to the next line after each row
        }
    }

    // Method to print an inverted right-angled triangle pattern with asterisks
    public static void reverseTriangle(int rowNum) {
        for (int i = rowNum; i >= 1; i--) { // Outer loop for each row
            // Inner loop for columns
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");// Print '*' followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}


