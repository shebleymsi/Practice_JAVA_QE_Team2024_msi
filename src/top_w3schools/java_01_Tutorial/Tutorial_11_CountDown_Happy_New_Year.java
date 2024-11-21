package top_w3schools.java_01_Tutorial;

public class Tutorial_11_CountDown_Happy_New_Year {
    public static void main(String[] args) {
        int countDown = 5;
        while(countDown > 0){
            System.out.println(countDown);
            //countDown--;
            countDown = countDown -1;
        }
        System.out.println("Happy new year?");
    }
}
