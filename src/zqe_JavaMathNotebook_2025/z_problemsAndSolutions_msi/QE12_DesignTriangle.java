package zqe_JavaMathNotebook_2025.z_problemsAndSolutions_msi;

public class QE12_DesignTriangle {
    public static void main(String[] args) {
        designTriangle(5);
    }

    public static void designTriangle(int row) {
        for (int i = 0; i < row; i++) {

            for (int j = row - i; j > 1; j--) { // Inner loop for space
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {  // for columns
                System.out.print("a ");
            }
            System.out.println();
        }
    }
}
