package xqe_JavaMathNotebook_2025.xw3school_java_How_To;

public class How_To_16_Generate_a_Random_Number {

    public static void main(String[] args) {
        //You can use Math.random() method to generate a random number.
        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.random());

        //if you only want a random number between 0 and 100, you can use the following formula:
        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println(randomNum);


    }
}
