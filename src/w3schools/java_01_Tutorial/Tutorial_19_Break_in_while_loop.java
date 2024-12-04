package w3schools.java_01_Tutorial;

public class Tutorial_19_Break_in_while_loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }

}

