package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.varargs;

public class AddDemo {

    void Add(int... num) {
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("Sum = " + sum);
    }

}
