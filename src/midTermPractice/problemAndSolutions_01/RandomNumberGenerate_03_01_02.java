package midTermPractice.problemAndSolutions_01;

import java.util.Random;

public class RandomNumberGenerate_03_01_02 {
    //Write Java program to generate a range of random number between 1 to 8.(with duplicate)


    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = 0;
        for (int i = 0; i < 8; i++) {
            // Generate a random integer between 1 and 8 (inclusive)
            randomInt = random.nextInt(8) + 1;
            System.out.print(randomInt + " ");
        }

    }

}
