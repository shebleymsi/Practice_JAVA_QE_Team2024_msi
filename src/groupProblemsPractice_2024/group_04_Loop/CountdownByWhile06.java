package groupProblemsPractice_2024.group_04_Loop;

public class CountdownByWhile06 { //done
    public static void main(String[] args) {
        getCountUpForLoop();
        getCountForLoop();
        getCountWhileLoop();
        getCountForEachLoop();
    }

    public static void getCountUpForLoop() {

        for (int count = 1; count <= 10; count++) {
            System.out.print(count + "\t");
        }
        System.out.println();
        System.out.println();
    }
    public static void getCountForLoop() {

        for (int count = 10; count >= 1; count--) {
            System.out.print(count + "\t");
        }
        System.out.println();
    }

    public static void getCountWhileLoop() {
        int count = 10;
        while (count >= 1) {
            System.out.print(count + "\t");
            count--;
        }
        System.out.println();
    }

    public static void getCountForEachLoop() {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
