package z_practiceNotebook;

public class SumOfNumbers {
    public static void main(String[] args) {
        getSumOfNumbers(10);
    }

    public static void getSumOfNumbers(int num) {

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}

//How can I calculate the sum of all numbers from 0 to a given number in Java?