package problemsAndSolutionsPractice_2022_2024;

public class CheckEvenOrOddNumber {

    public static void main(String[] args) {
        checkEvenOrOdd(34);

    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " Is an Even Number");
        } else {
            System.out.println(number + " Is an Odd Number");
        }
    }

}
