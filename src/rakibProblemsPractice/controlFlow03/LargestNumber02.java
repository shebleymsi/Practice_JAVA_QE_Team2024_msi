package rakibProblemsPractice.controlFlow03;

import java.util.Scanner;

public class LargestNumber02 { //done

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;


        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}

