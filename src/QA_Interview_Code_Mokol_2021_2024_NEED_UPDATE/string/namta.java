package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.string;

import java.util.Scanner;

public class namta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = sc.nextInt();

//        int a = 6;
        for(int i = 1; i <= 10; ++i) {
            System.out.println(a + "*" + i + " = " + a * i);
        }
    }
}
