package Practice_Lecture_LearnJava_QE_Winter2022_.learnJava_11_collectionFramework.sort;

public class LearnSwap {

    public static void main(String[] args) {

        int num1 = 55;
        int num2 = 66;
        int temp;
        System.out.println("Number1 value : " + num1);
        System.out.println("Number2 value : " + num2);

        temp = num1;
        num2 = temp;
        num1 = temp + num2;
        temp = num2;
        System.out.println(temp); // output is: 55

    }

}