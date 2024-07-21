package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.varargs;

public class AddDemo {

    void Add(int... num) {
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("Sum = " + sum);
    }

}
