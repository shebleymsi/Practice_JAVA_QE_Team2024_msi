package problems_midTermPractice_2022_2024_group.practice_01_problemAndSolutions;

import java.util.Random;

public class RandomNumberGenerate_03_01_All {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {
        Random random = new Random();

        //print a random number -infinity to +infinity
        int randomInt1 = random.nextInt();
        System.out.println("1.random number -infinity to +infinity: "+randomInt1);

        // Generate a random integer between 1 and 8(inclusive). //(reality inside code 8 exclusive)
        int randomInt2 = random.nextInt(8) + 1;
        System.out.println("2.Random Integer between 1 and 8: " + randomInt2);

        //get a number randomly from specific range, EX:50 to 60
        int min = 50, max = 60;
        int randomInt3 = min + random.nextInt(max - min + 1);
        System.out.println("3.get a number randomly from 50 to 60: "+randomInt3);

        //Write Java program to generate a range of random numbers(5 number) between 1 to 8.(with duplicate)
        int randomInt4 = 0;
        System.out.print("4.random numbers of series(print 5 numbers) from 1 to 8: ");
        for (int i = 0; i < 5; i++) {
            // Generate a random integer between 1 and 8 (inclusive)
            randomInt4 = random.nextInt(8) + 1;
            System.out.print(randomInt4+" ");
        }

        // Write a Java program to generate:
        // a series of random numbers(print a total 5 numbers) min  50 to  max 60. (with duplicate)
        int min1 = 50;
        int max1 = 60;
        System.out.print("\n5.random numbers of series(print 5 numbers) from min to max: ");
        for (int i = 0; i < 5; i++) {
            int randomInt5 = random.nextInt(max1 - min1 + 1) + min;
            System.out.print(randomInt5+" ");
        }

    }

}
