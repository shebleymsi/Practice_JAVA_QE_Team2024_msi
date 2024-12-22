package w3_JAVA.java_01_Tutorial;

import java.util.Scanner;

public class Tutorial_11_Sequential_Dice_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number among 1 to 6 : ");
        int dice = input.nextInt();

        //int dice = 1;
        while (dice <= 6) {
            if(dice<6){
                System.out.println("No Yahoo ... ");
            }else{
                System.out.println("Yahoo ... ");
            }
            dice = dice + 1;
        }
        input.close();
    }

}
//If the loop passes the values ranging from 1 to 5,
// it prints "No Yatzy". Whenever it passes the value 6, it prints "Yatzy!".
