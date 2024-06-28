package midTermPractice.problemAndSolutions_01;

import java.util.Random;

public class RandomNumberGenerate_03_01 {
    //Write Java program to generate a random number between 1 to 8.


    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer between 1 and 8(inclusive). //(reality inside code 8 exclusive)
        int randomInt = random.nextInt(8) + 1;
        System.out.println("Random Integer between 1 and 8: " + randomInt);
    }

}
