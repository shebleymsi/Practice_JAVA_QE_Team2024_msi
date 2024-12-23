package zqe_JavaMathNotebook_2025.problemsAndSolutions_msi;

public class QE03_CheckEvenOrOdd {
    public static void main(String[] args) {

        checkEvenOrOddNumber(19);
    }

    public static void checkEvenOrOddNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even");
        } else {
            System.out.println(num + " is an odd");
        }

    }
}


// How can I check if a given number is even or odd in Java?