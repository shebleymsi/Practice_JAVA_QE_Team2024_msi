package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

import java.util.Random;

public class TCS_32_GenerateRandomNumbers {
    //32. Generate Random Numbers
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(100)); // Random number between 0-99
        }
    }

}

