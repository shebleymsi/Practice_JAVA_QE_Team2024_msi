package zqe_JavaMathNotebook_2025.DesignPattern;

public class DesignTriangle_QE12 {

    public static void main(String[] args) {

        designTriangle(5);

    }

    public static void designTriangle(int row) {
        for (int i = 0; i < row; i++) {

            // Inner loop for space
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }

            // for columns
            for (int j = 0; j <= i; j++) {
                System.out.print("a ");
            }
            System.out.println();

        }

    }

}
