package w3schools.java_01_Tutorial;

public class Tutorial_12_Do_While_loop {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
//The do/while loop is a variant of the while loop.
//This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
//The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
//Do not forget to increase the variable used in the condition, otherwise the loop will never end!
