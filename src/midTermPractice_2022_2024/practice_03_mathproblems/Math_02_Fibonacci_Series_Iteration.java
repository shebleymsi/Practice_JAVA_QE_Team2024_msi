package midTermPractice_2022_2024.practice_03_mathproblems;

public class Math_02_Fibonacci_Series_Iteration {
    /*
    Write up to 40 Fibonacci numbers with java.
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    */
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + ", " + n2);//printing 0 and 1
        for (i = 2; i < count; i++) { //loop starts from 2 because 0 and 1 are already printed
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}




