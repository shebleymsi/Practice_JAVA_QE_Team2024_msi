package w3_JAVA.java_01_Tutorial;

public class Tutorial_18_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 4){
                break;
            }
            System.out.print(i);
        }
    }

}
//It was used to "jump out" of a switch statement.
//The break statement can also be used to jump out of a loop.
