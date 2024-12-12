package zQE_practiceNotebook.DesignPattern;

public class DesignReverseTriangle {
    public static void main(String[] args) {
        reverseTriangle(5);
    }

    public static void reverseTriangle(int rowNum) {
        for (int i = rowNum; i >= 1; i--) {
            for (int k = i; k >= 1; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}
