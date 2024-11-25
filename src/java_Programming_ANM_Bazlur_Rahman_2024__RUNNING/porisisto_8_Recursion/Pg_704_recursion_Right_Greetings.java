package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.porisisto_8_Recursion;

public class Pg_704_recursion_Right_Greetings {
    int count;

    //recursive method
    public void greet() {

        //base case
        if (count == 5) {
            return;
        }
        System.out.println("Hello, world");
        count++;

        //recursive case
        greet();
    }

    public static void main(String[] args) {
        Pg_704_recursion_Right_Greetings greetings = new Pg_704_recursion_Right_Greetings();
        greetings.greet();
    }


}

//note: must read explanation from pg703 bottom