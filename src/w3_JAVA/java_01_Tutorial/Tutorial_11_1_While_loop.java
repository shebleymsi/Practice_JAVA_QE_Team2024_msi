package w3_JAVA.java_01_Tutorial;

public class Tutorial_11_1_While_loop {
    // print 0 to 5 use while loop
    // 0 1 2 3 4 5
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            System.out.print(" "+i);
            i = i+1;
            //i++;
        }
    }
}
//Loops can execute a block of code as long as a specified condition is reached.
//The "while loop" loops through a block of code as long as a specified condition is true:
//Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!


