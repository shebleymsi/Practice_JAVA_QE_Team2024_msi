package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.oop_1;

public class FactorialDemo {

    int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    
    /* // Iteration : Factorial by loop
    
        public static void main(String[] args) {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }  */

}

