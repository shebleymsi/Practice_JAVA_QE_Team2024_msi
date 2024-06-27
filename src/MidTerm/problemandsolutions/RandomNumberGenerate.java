package MidTerm.problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {

        Random rn = new Random();

        for(int i =0; i < 8; i++)  // 8 number show
        {
            int answer = rn.nextInt(8) + 1;  //  between 1 to 8.
            System.out.print(answer+" ");
        }

    }

}
