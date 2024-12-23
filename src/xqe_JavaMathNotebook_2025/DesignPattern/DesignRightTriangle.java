package xqe_JavaMathNotebook_2025.DesignPattern;

public class DesignRightTriangle {

    public static void main(String[] args) {

        rightTriangle(5);

    }

    public static void rightTriangle(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {
            // parent for loop
            for (int j = 1; j <= i; j++) {
                // child/ nested for loop
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }

    }

}
