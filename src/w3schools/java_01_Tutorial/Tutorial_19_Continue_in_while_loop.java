package w3schools.java_01_Tutorial;

public class Tutorial_19_Continue_in_while_loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                continue;
            }
            System.out.print(i);
            i++;
        }
    }
}

