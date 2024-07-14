package miscellanious_bazlor.ch_04;

public class Pg_188_HalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows for the half pyramid

        // Outer loop to handle the number of rows
        for (int i = 1; i < rows; i++) {
            // Inner loop to handle the number of columns (print '*' i times)
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(); // Move to the next line after each row is printed
        }

    }

    /*
    i = 1 , 1 < 5 , i = 1+1
        j = 0, 0 < 1 , j = 1
        j = 1, 1 < 1 , j = 1+1

    i = 2, 2 < 5 , i = 2 + 1
        j = 0 , 0< 2 , j = 1
        j = 1 , 1 < 2, j = 1+1
        j = 2 , 2 < 2, j = 2 +1

    i = 3, 3 < 5 , i = 3 + 1
        j = 0 , 0< 3 , j = 1
        j = 1 , 1 < 3, j = 1+1
        j = 2 , 2 < 3, j = 2 +1
        j = 3 , 3 < 3, j = 3 +1

    i = 4, 4 < 5 , i = 4 + 1
        j = 0 , 0< 4 , j = 1
        j = 1 , 1 < 4, j = 1+1
        j = 2 , 2 < 4, j = 2 +1
        j = 3 , 3 < 4 j = 3 +1
        j = 4 , 4 < 4 j = 4 +1

    i = 5, 5 < 5 , i = 5 + 1

    output:
    *
    * *
    * * *
    * * * *
     */
}
