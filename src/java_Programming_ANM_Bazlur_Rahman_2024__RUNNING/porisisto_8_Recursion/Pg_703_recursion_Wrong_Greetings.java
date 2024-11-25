package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.porisisto_8_Recursion;

public class Pg_703_recursion_Wrong_Greetings {

    public void greet(){
        System.out.println("Hello, world");
        greet();
    }

    public static void main(String[] args) {
        Pg_703_recursion_Wrong_Greetings greetings = new Pg_703_recursion_Wrong_Greetings();
        greetings.greet();
    }


}

//note: must read explanation from pg703 bottom
//pg_708 bottom